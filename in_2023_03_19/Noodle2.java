// LEARN JAVA / INHERITANCE AND POLYMORPHISM / Parent Class Aspect Modifiers

package in_2023_03_19;

public class Noodle2 {
    private double lengthInCentimeters;
    private double widthInCentimeters;
    private String shape;
    protected String ingredients;
    private String texture = "brittle";

    Noodle2(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public final boolean isTasty() {

        return true;

    }

    public static void main(String[] args) {

        Ramen2 yasaiRamen = new Ramen2();
        System.out.println(yasaiRamen.ingredients);
        System.out.println(yasaiRamen.isTasty());

    }

}