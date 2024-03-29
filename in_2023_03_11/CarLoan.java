// LEARN JAVA / A Simple Car Loan Payment Calculator

package in_2023_03_11;

/*
Ten wspaniały program liczy ile palców miesięcznie będą ci obcinać
jak se kupisz auto na kredyt i nie będziesz płacił rat.
 */

public class CarLoan {
    public static void main(String[] args) {
        int carLoan = 10000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 2000;

        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take a valid car loan.");
        } else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = monthlyBalance * interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }
    }
}
