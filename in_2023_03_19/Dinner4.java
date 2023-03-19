// LEARN JAVA / INHERITANCE AND POLYMORPHISM / Using a Child Class as its Parent Class

package in_2023_03_19;

public class Dinner4 {

    private void makeNoodles(Noodle4 noodle, String sauce) {

        noodle.cook();

        System.out.println("Mixing " + noodle.texture + " noodles made from " + noodle.ingredients + " with " + sauce + ".");
        System.out.println("Dinner is served");
    }

    public static void main(String[] args) {

        Dinner4 noodlesDinner = new Dinner4();
        // Add your code here:
        Noodle4 biangBiang = new BiangBiang4();
        noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");
    }
}
