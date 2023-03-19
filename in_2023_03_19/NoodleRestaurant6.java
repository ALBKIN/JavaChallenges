// LEARN JAVA / INHERITANCE AND POLYMORPHISM / Child Classes in Method Parameters

package in_2023_03_19;

public class NoodleRestaurant6 {
    String name;

    public NoodleRestaurant6(String customerName) {
        name = customerName;
    }

    public void order(Noodle6 noodle) {
        System.out.println(noodle.getCookPrep());
        System.out.println("Order for " + name + " is ready");
    }

    public static void main(String[] args) {
        Noodle6 ramen, pho;
        ramen = new Ramen6();
        pho = new Pho6();

        NoodleRestaurant6 customer1 = new NoodleRestaurant6("Sagirah");
        NoodleRestaurant6 customer2 = new NoodleRestaurant6("Maritza");

        // Add your code here:
        customer1.order(pho);
        customer2.order(ramen);
    }



}
