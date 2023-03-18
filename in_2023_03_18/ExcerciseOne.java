// LEARN JAVA / STATIC VARIABLES AND METHODS / Static Methods Refresher

package in_2023_03_18;

public class ExcerciseOne {
    public static void main(String[] args) {

        double randomNum = (double) (Math.random() * 10 + 1);
        System.out.println("Your random number between one and ten is " + randomNum);

        int negativeNum = -2;
        int absNum = Math.abs(negativeNum);
        System.out.println("The absolute value of " + negativeNum + " is " + absNum);

        String myNewString = Integer.toString(1);
        System.out.println(myNewString);

    }
}

