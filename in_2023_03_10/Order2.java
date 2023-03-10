// LEARN JAVA / CONDITIONALS AND CONTROL FLOWS / Review

package in_2023_03_10;

public class Order2 {
    boolean isFilled;
    double billAmount;
    String shipping;

    // constructor method
    public Order2(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        } else {
            System.out.println("Low value item...");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    // shipping method
    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
        } else {
            System.out.println("Order not ready");
        }

        double shippingCost = calculateShipping();

        System.out.println("Shipping cost: ");
        System.out.println(shippingCost);
    }

    // calculate shipping cost method
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
                shippingCost = 0.50;
        }
        return shippingCost;
    }

    // main method
    public static void main(String[] args) {
        Order2 toyCar = new Order2(true, 23.12, "Regular");
        Order2 umbrella = new Order2(false, 8.99, "Regular");
        Order2 discman = new Order2(true, 92.17, "Express");

        toyCar.ship();
        umbrella.ship();
        discman.ship();
    }
}
