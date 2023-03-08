public class _20230308_005_Store {
    // instance fields
    String productType;
    double price;

    // constructor method
    public _20230308_005_Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // main method
    public static void main(String[] args) {
        _20230308_005_Store lemonadeStand = new _20230308_005_Store("Lemonade", 3.75);
        lemonadeStand.increasePrice(1.5);
        System.out.println(lemonadeStand.price);
    }
}