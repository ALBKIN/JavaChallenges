// JAVA: ALGORITHMS / Recursion in Java / Recursive Case

package in_2023_04_07;

public class Factorial {

    public static int recursiveFactorial(int n) {
        if (n > 0) {
            System.out.println("Execution context: " + n);

            return n * recursiveFactorial(n - 1);
        } else {
            return 1;
        }
    }

    public static int iterativeFactorial(int n) {
        int result = 1;

        while (n > 0) {
            result *= n;
            n -= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int recursiveSolution = recursiveFactorial(4);
        System.out.println(recursiveSolution);

        int iterativeSolution = iterativeFactorial(5);
        System.out.println(iterativeSolution);
    }
}
