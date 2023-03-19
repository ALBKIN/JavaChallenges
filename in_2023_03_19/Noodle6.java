// LEARN JAVA / INHERITANCE AND POLYMORPHISM / Child Classes in Method Parameters


package in_2023_03_19;

class Noodle6 {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    Noodle6(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    public String getCookPrep() {
        return "Boil noodle for 7 minutes and add sauce";
    }
}
