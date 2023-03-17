// LEARN JAVA / ACCESS, ENCAPSULATION AND SCOPE / Accessor and Mutator Methods


package in_2023_03_16;

public class CheckingAccount2 {
    private String name;
    private int balance;
    private String id;

    public CheckingAccount2(String inputName, int inputBalance, String inputId) {
        name = inputName;
        balance = inputBalance;
        id = inputId;
    }

    // Write new methods here:
    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int newBalance) {
        balance = newBalance;
    }
}
