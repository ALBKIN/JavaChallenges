package in_2023_10_10;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class BalancedSystemFilePartition {

    /*
     * Complete the 'mostBalancedPartition' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY parent
     *  2. INTEGER_ARRAY files_size
     */

    public static int mostBalancedPartition(List<Integer> parent, List<Integer> files_size) {
        int n = parent.size();
        List<List<Integer>> children = new ArrayList<>(n);

        // Initialize children list.
        for (int i = 0; i < n; i++) {
            children.add(new ArrayList<>());
        }

        // Build tree structure by children.
        for (int i = 1; i < n; i++) {
            children.get(parent.get(i)).add(i);
        }

        int[] subtreeSize = new int[n];
        computeSubtreeSize(0, children, files_size, subtreeSize);

        int totalSize = subtreeSize[0];
        int[] diff = new int[1];
        diff[0] = totalSize;

        findMinDiff(0, totalSize, children, subtreeSize, diff);

        return diff[0];
    }

    private static int computeSubtreeSize(int root, List<List<Integer>> children,
                                          List<Integer> files_size, int[] subtreeSize) {
        int totalSize = files_size.get(root);

        for (int child : children.get(root)) {
            totalSize += computeSubtreeSize(child, children, files_size, subtreeSize);
        }

        subtreeSize[root] = totalSize;
        return totalSize;
    }

    private static void findMinDiff(int root, int totalSize, List<List<Integer>> children,
                                    int[] subtreeSize, int[] diff) {
        for (int child : children.get(root)) {
            diff[0] = Math.min(diff[0], Math.abs(totalSize - 2 * subtreeSize[child]));
            findMinDiff(child, totalSize, children, subtreeSize, diff);
        }
    }

    public static void main(String[] args) throws IOException {
        List<List<Integer>> parents = Arrays.asList(
                Arrays.asList(-1, 0, 0, 0),
                Arrays.asList(-1, 0),
                Arrays.asList(-1, 0, 0, 0, 0, 3, 4, 6, 0, 3)
        );

        List<List<Integer>> fileSizes = Arrays.asList(
                Arrays.asList(10, 11, 10, 10),
                Arrays.asList(20, 100),
                Arrays.asList(10, 298, 2187, 5054, 266, 1989, 6499, 5450, 2205, 5893, 8095)
        );

        for (int i = 0; i < parents.size(); i++) {
            int result = BalancedSystemFilePartition.mostBalancedPartition(parents.get(i), fileSizes.get(i));
            System.out.println(result);
        }
    }
}