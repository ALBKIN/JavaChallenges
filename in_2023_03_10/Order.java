// LEARN JAVA / CONDITIONALS AND CONTROL FLOWS / Nested Conditional Statements

package in_2023_03_10;

public class Order {
    boolean isFilled;
    double billAmount;
    String shipping;
    String couponCode;

    // constructor method
    public Order(boolean filled, double cost, String shippingMethod, String coupon) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
        couponCode = coupon;
    }

    // shipping method
    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Shipping not ready");
        }
    }

    // calculate shipping cost method
    public double calculateShipping() {
        if (shipping.equals("Regular")) {
            return 0;
        } else if (shipping.equals("Express")) {
            if (couponCode.equals("ship50")) {
                return 0.85;
            } else {
                return 1.75;
            }
        } else {
            return 0.50;
        }
    }

    // main method
    public static void main(String[] args) {
        // do not alter the main method!
        Order book = new Order(true, 9.99, "Express", "ship50");
        Order chemistrySet = new Order(false, 72.50, "Regular", "freeShipping");

        book.ship();
        chemistrySet.ship();
    }

}
