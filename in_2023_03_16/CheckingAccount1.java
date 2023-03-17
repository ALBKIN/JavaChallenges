// LEARN JAVA / ACCESS, ENCAPSULATION AND SCOPE / The private Keyword and Encapsulation

package in_2023_03_16;

public class CheckingAccount1 {
    public String name;
    private int balance;

    public CheckingAccount1(String inputName, int inputBalance) {
        name = inputName;
        balance = inputBalance;
    }

    public void addFunds(int fundsToAdd) {
        balance += fundsToAdd;
    }

    public void getInfo() {
        System.out.println("This checking account belongs to " + name + ". It has " + balance + " dollars in it.");
    }

    public static void main(String[] args) {
        CheckingAccount1 myAccount = new CheckingAccount1("GodBert", 100000);
        System.out.println(myAccount.balance);
        myAccount.addFunds(5);
        System.out.println(myAccount.balance);
    }
}
