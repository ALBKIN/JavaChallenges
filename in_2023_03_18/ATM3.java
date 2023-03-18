// LEARN JAVA / STATIC VARIABLES AND METHODS / Review

package in_2023_03_18;

public class ATM3 {
    // Static variables
    public static int totalMoney = 0;
    public static int numATMs = 0;

    // Instance variables
    public int money;

    public ATM3(int inputMoney) {
        this.money = inputMoney;
        numATMs += 1;
        totalMoney += inputMoney;
    }

    public void withdrawMoney(int amountToWithdraw) {
        if (amountToWithdraw <= this.money) {
            this.money -= amountToWithdraw;
            totalMoney -= amountToWithdraw;
        }
    }

    public void depositMoney(int amountToDeposit) {
        this.money += amountToDeposit;
        totalMoney += amountToDeposit;
    }

    public static void averageMoney() {
        System.out.println(totalMoney / numATMs);
    }

    public static void main(String[] args) {

        System.out.println("Total number of ATMs: " + ATM3.numATMs);
        ATM3 firstATM3 = new ATM3(1000);
        ATM3 secondATM3 = new ATM3(500);
        ATM3 thirdATM3 = new ATM3(2750);

        System.out.println("Total number of ATMs: " + ATM3.numATMs);

        System.out.println("Total amount of money in all ATMs: " + ATM3.totalMoney);
        firstATM3.withdrawMoney(500);
        secondATM3.withdrawMoney(200);
        thirdATM3.depositMoney(74);
        System.out.println("Total amount of money in all ATMs: " + ATM3.totalMoney);

        // Call averageMoney() here
        ATM3.averageMoney();
    }
}
