// LEARN JAVA: METHODS / REVIEW

package in_2023_03_09;

public class SavingsAccount {

    int balance;

    public SavingsAccount(int initialBalance) {
        balance = initialBalance;
    }

    // check balance method
    public void checkBalance() {
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }

    // deposit method
    public void deposit(int amountToDeposit) {
        int afterDeposit = amountToDeposit + balance;
        balance = afterDeposit;
        System.out.println("You just deposited " + amountToDeposit);
    }

    // withdraw method
    public int withdraw(int amountToWithdraw) {
        int afterWithdraw = balance - amountToWithdraw;
        balance = afterWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);
        return amountToWithdraw;
    }

    public String toString() {
        return "This is your savings account balance: " + balance;
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(2000);

        //Check balance:
        savings.checkBalance();

        //Withdrawing:
        savings.withdraw(10000);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        savings.deposit(600);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        int afterDeposit2 = savings.balance + 600;
        savings.balance = afterDeposit2;
        System.out.println("You just deposited " + 600);

        //Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);
        // lub używając toString()
        System.out.println(savings);


    }
}
