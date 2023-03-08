public class _20230308_003_Store {
    // instance fields
    String productType;

    // constructor method
    public _20230308_003_Store(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    // main method
    public static void main(String[] args) {
        String cookie = "Cookies";
        _20230308_003_Store cookieShop = new _20230308_003_Store(cookie);

        cookieShop.advertise();

    }
}