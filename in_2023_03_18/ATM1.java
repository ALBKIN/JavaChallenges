// LEARN JAVA / STATIC VARIABLES AND METHODS / Modifying Static Variables

package in_2023_03_18;

public class ATM1 {
    // Static variables
    public static int totalMoney = 0;
    public static int numATMs = 0;

    // Instance variables
    public int money;

    public ATM1(int inputMoney) {
        this.money = inputMoney;

        // Steps 1 and 2: Edit numATMs and total money here
        numATMs += 1;
        totalMoney += inputMoney;
    }

    public void withdrawMoney(int amountToWithdraw) {
        if (amountToWithdraw <= this.money) {
            this.money -= amountToWithdraw;
            // Step 3: Edit totalMoney here
            totalMoney -= amountToWithdraw;
        }
    }
    public static void main(String[] args) {

        System.out.println("Total number of ATMs: " + ATM1.numATMs);
        ATM1 firstATM1 = new ATM1(1000);
        ATM1 secondATM1 = new ATM1(500);
        System.out.println("Total number of ATMs: " + ATM1.numATMs);

        System.out.println("Total amount of money in all ATMs: " + ATM1.totalMoney);
        firstATM1.withdrawMoney(500);
        secondATM1.withdrawMoney(200);
        System.out.println("Total amount of money in all ATMs: " + ATM1.totalMoney);

    }
}
