public class _20230308_004_Store {
    // instance fields
    String productType;

    // constructor method
    public _20230308_004_Store(String product) {
        productType = product;
    }

    // greet method
    public void greetCustomer(String customer) {
        System.out.println("Welcome to the store, " + customer + "!");
    }

    // advertise method
    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    // main method
    public static void main(String[] args) {
        _20230308_004_Store lemonadeStand = new _20230308_004_Store("Lemonade");
        lemonadeStand.greetCustomer("Allbert");
    }
}