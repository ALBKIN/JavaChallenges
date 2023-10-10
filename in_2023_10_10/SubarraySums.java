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


class SubarraySums {

    /*
     * Complete the 'findSum' function below.
     *
     * The function is expected to return a LONG_INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY numbers
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Long> findSum(List<Integer> numbers, List<List<Integer>> queries) {
        // Calculate the prefix sum
        long[] prefixSum = new long[numbers.size() + 1];
        int[] prefixZeros = new int[numbers.size() + 1];

        prefixSum[0] = 0;
        prefixZeros[0] = 0;

        for (int i = 1; i <= numbers.size(); i++) {
            prefixSum[i] = prefixSum[i - 1] + numbers.get(i - 1);
            prefixZeros[i] = prefixZeros[i - 1] + (numbers.get(i - 1) == 0 ? 1 : 0);
        }

        // Initialize results list
        List<Long> results = new ArrayList<>();

        // Calculate sum for each query using prefix sum and count zeros
        for (List<Integer> query : queries) {
            int start = query.get(0);
            int end = query.get(1);
            long threshold = query.get(2);

            long sum = prefixSum[end] - prefixSum[start - 1];
            int zeroCount = prefixZeros[end] - prefixZeros[start - 1];

            sum += zeroCount * threshold;
            results.add(sum);
        }

        return results;
    }

    public static void main(String[] args) throws IOException {
        // Hardcoded input values
        List<Integer> numbers = Arrays.asList(5, 10, 10);

        List<List<Integer>> queries = new ArrayList<>();
        queries.add(Arrays.asList(1, 3, 5));

        // Call the findSum method using hardcoded values
        List<Long> result = SubarraySums.findSum(numbers, queries);

        // Print the results
        result.forEach(System.out::println);
    }
}

