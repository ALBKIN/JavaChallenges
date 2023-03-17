// LEARN JAVA / ACCESS, ENCAPSULATION AND SCOPE / The private Keyword and Encapsulation

package in_2023_03_16;

public class Bank1 {
    private CheckingAccount1 accountOne1;
    private CheckingAccount1 accountTwo1;

    public Bank1() {
        accountOne1 = new CheckingAccount1("Andromeda", 100);
        accountTwo1 = new CheckingAccount1("Demeter", 200);
    }

    public static void main(String[] args) {
        Bank1 bankOfGods1 = new Bank1();
        System.out.println(bankOfGods1.accountOne1.name);
        bankOfGods1.accountOne1.addFunds(5);
        bankOfGods1.accountOne1.getInfo();
    }
}
