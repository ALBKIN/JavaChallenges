// LEARN JAVA / ACCESS, ENCAPSULATION AND SCOPE / Scope: Local Variables

package in_2023_03_16;

public class ScopeExample {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println(sum);
    }
}

