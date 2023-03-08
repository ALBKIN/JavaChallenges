public class _20230308_001_Store {
    // instance fields
    String productType;

    // constructor method
    public void _20230308_001_Store(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        System.out.println("Come spend some money!");
        System.out.println("Selling " + productType + "!");
    }

    // main method
    public static void main(String[] args) {

    }
}

