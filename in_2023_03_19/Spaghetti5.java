// LEARN JAVA / INHERITANCE AND POLYMORPHISM / Child Classes in Arrays and ArrayLists

package in_2023_03_19;

class Spaghetti5 extends Noodle5 {
    Spaghetti5() {

        super(30.0, 0.2, "round", "semolina flour");
    }

    @Override
    public String getCookPrep() {

        return "Boil spaghetti for 8 - 12 minutes and add sauce, cheese, or oil and garlic.";

    }
}

