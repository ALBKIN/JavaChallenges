// LEARN JAVA / ACCESS, ENCAPSULATION AND SCOPE / Accessor and Mutator Methods

package in_2023_03_16;

public class Bank2 {
    private CheckingAccount2 accountOne2;
    private CheckingAccount2 accountTwo2;

    public Bank2() {
        accountOne2 = new CheckingAccount2("Thor", 100, "1");
        accountTwo2 = new CheckingAccount2("Odin", 200, "2");
    }

    public static void main(String[] args) {
        Bank2 bankOfGods2 = new Bank2();
        System.out.println(bankOfGods2.accountOne2.getBalance());
        bankOfGods2.accountOne2.setBalance(5000);
        System.out.println(bankOfGods2.accountOne2.getBalance());
    }
}
