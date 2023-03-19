// LEARN JAVA / INHERITANCE AND POLYMORPHISM / Inheriting the Constructor

package in_2023_03_19;

public class Noodle1 {

    double lengthInCentimeters;
    double widthInCentimeters;
    String shape;
    String ingredients;
    String texture = "brittle";

    Noodle1(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    public void Cook() {
        this.texture = "cooked";
    }

    public static void main(String[] args) {
        Pho1 phoChay = new Pho1();
        System.out.println(phoChay.shape);
    }
}
