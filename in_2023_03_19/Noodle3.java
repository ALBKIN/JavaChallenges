// LEARN JAVA / INHERITANCE AND POLYMORPHISM / Method Overriding

package in_2023_03_19;

public class Noodle3 {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle3(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    public void cook() {

        System.out.println("Boiling.");
        this.texture = "cooked";
    }

    public static void main(String[] args) {
        Spaetzle3 kaesespaetzle = new Spaetzle3();
        kaesespaetzle.cook();
    }
}

