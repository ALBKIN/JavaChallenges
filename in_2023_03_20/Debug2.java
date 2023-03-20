// LEARN JAVA / DEBUGGING / Exception Handling

package in_2023_03_20;

public class Debug2 {
    public static void main(String[] args) {

        int width = 0;
        int length = 40;

        try {

            int ratio = length / width;

        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception " + e.getMessage());
            // "ERROR! Pamiętaj cholero nie dziel przez zero");
        }
    }
}
