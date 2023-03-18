// LEARN JAVA / ACCESS, ENCAPSULATION AND SCOPE / Other Private Methods

package in_2023_03_17;

import in_2023_03_17.CheckingAccount;

public class Bank {
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;

    public Bank() {
        this.accountOne = new CheckingAccount("Zeus", 100, "1");
        this.accountTwo = new CheckingAccount("Hades", 200, "2");
    }

    public static void main(String[] args) {
        Bank bankOfGods = new Bank();
        bankOfGods.accountOne.getAccountInformation();
        /*
        bankOfGods.accountOne.calculateNextMonthInterest();
        won't work as the method is private in CheckingAccount
         */
    }
}
