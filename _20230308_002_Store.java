public class _20230308_002_Store {
    // instance fields
    String productType;

    // constructor method
    public _20230308_002_Store(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");
    }

    // main method
    public static void main(String[] args) {
        _20230308_002_Store lemonadeStand = new _20230308_002_Store("Lemonade");
        lemonadeStand.advertise();
        lemonadeStand.advertise();
        lemonadeStand.advertise();
    }
}
