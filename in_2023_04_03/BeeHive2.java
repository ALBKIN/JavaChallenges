// Java Code Challenge: Loops Involving ArrayLists

package in_2023_04_03;

import java.util.ArrayList;

public class BeeHive2 {
    private ArrayList<Bee> beeList;

    public BeeHive2(int numBees) {
        this.beeList = new ArrayList<Bee>();
        for (int i = 0; i < numBees; i++) {
            this.beeList.add(new Bee("bee" + i));
        }
    }

    public ArrayList<Bee> getBeeList() {
        return this.beeList;
    }

    public void addBees(ArrayList<String> beeNames) {
        for (String name : beeNames) {
            this.beeList.add(new Bee(name));
        }
    }

    public static void main(String[] args) {
        BeeHive2 myHive = new BeeHive2(3);
        ArrayList<String> newBees = new ArrayList<String>();
        newBees.add("bob");
        newBees.add("macey");
        newBees.add("anna");

        myHive.addBees(newBees);

        // Print out the elements in the bee list to make sure the new bees were added
        for (Bee pszczola : myHive.beeList) {
            System.out.println(pszczola.getName());
        }
    }
}
