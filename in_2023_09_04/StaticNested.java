// JAVA EXERCISE - STATIC NESTED CLASSES

package in_2023_09_04;

class VendingMachine {
    public static class ChocolateBar {
        public String getName() {
            return "Snickers";
        }

        public double getPrice(){
            return 3.99;
        }
    }

    public static class BagOfChips {
        public String getName() {
            return "Cheetos";
        }

        public double getPrice() {
            return 2.00;
        }
    }
}

public class StaticNested {
    public static void main(String[] args) {
        VendingMachine.ChocolateBar mikesChocolateBar = new VendingMachine.ChocolateBar();
        VendingMachine.BagOfChips gabbysBagOfChips = new VendingMachine.BagOfChips();

        System.out.println("Mike's " + mikesChocolateBar.getName() + " chocolate bar costs " + mikesChocolateBar.getPrice());
        System.out.println("Gabby's " + gabbysBagOfChips.getName() + " bag of chips costs " + gabbysBagOfChips.getPrice());
    }
}
