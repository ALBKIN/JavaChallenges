// LEARN JAVA / STATIC VARIABLES AND METHODS / Static Variables

package in_2023_03_18;

public class ATM {

    // Step 2: Create your static variables here
    public static int totalMoney = 0;
    public static int numATMs = 0;

    // Instance variables
    public int money;

    public ATM(int inputMoney) {
        this.money = inputMoney;
    }

    public void withdrawMoney(int amountToWithdraw) {
        if (amountToWithdraw <= this.money) {
            this.money -= amountToWithdraw;
        }
    }
    public static void main(String[] args) {
     // Step 1: Create your two ATMs here
     ATM firstATM = new ATM(1000);
     ATM secondATM = new ATM(500);
     System.out.println(firstATM.money);
     System.out.println(secondATM.money);

     // Step 3: Print your static variable in three different ways here
     System.out.println(ATM.totalMoney);
     System.out.println(firstATM.totalMoney);
     System.out.println(firstATM.totalMoney);

    }
}
