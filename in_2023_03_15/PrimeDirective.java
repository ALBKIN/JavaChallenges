// LEARN JAVA / Prime Directive

package in_2023_03_15;

import java.util.ArrayList;

class PrimeDirective {
    // Add your methods here:
    // method for checking weather a number is prime or not
    public boolean isPrime(int number) {
        if (number == 2) {
            return true;
        } else if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    // method for creating an ArrayList of only prime numbers from a mixed number Array
    public ArrayList<Integer> onlyPrimes(int[] numbers) {

        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }
    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(pd.onlyPrimes(numbers));
    }
}
