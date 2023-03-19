// LEARN JAVA / INHERITANCE AND POLYMORPHISM / Child Classes in Method Parameters

package in_2023_03_19;

class Ramen6 extends Noodle6 {

    Ramen6() {

        super(30.0, 0.64, "flat", "rice flour");

    }

    @Override
    public String getCookPrep() {

        return "Soak pho for 1 hour, then boil for 1 minute in broth. Then garnish with cilantro and jalapeno.";
    }
}
