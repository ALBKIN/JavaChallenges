// LEARN JAVA / ACCESS, ENCAPSULATION AND SCOPE / Scope: The this Keyword

package in_2023_03_16;

public class SavingsAccount {

    public String owner;
    public int balanceDollar;
    public double balanceEUro;

    public SavingsAccount(String owner, int balanceDollar) {
        // Complete the constructor
        this.owner = owner;
        this.balanceDollar = balanceDollar;
        this.balanceEUro = balanceDollar * 0.85;
    }

    public void addMoney(int balanceDollar) {
        // Complete this method
        System.out.println("Adding " + balanceDollar + " dollars to the account");
        this.balanceDollar += balanceDollar;
        System.out.println("The new balance is " + this.balanceDollar + " dollars.");
    }

    public static void main(String[] args) {
        SavingsAccount zeusSavingsAccount = new SavingsAccount("Zeus", 1000);

        // Make a call to addMoney() to test your method
        System.out.println("Current balance is " + zeusSavingsAccount.balanceDollar + " dollars.");
        zeusSavingsAccount.addMoney(2000);
        System.out.println(zeusSavingsAccount.balanceDollar);
    }
}
