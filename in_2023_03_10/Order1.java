// LEARN JAVA / CONDITIONALS AND CONTROL FLOWS / Switch Statement

package in_2023_03_10;

public class Order1 {
    boolean isFilled;
    double billAmount;
    String shipping;

    // constructor method
    public Order1(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    // shipping method
    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }

    // shipping cost calculation method USING SWITCH
    public double calculateShipping() {
        double shippingCost;
        switch (shipping) {
            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                 shippingCost = 1.75;
                 break;
            default:
                shippingCost = 0.5;
        }
        return shippingCost;
    }

    // main method
    public static void main(String[] args) {
        Order1 book = new Order1(true, 9.99, "Express");
        Order1 chemistrySet = new Order1(false, 72.50, "Regular");

        book.ship();
        chemistrySet.ship();
    }
}
