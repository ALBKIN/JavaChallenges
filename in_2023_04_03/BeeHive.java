// Java Code Challenge: Loops Involving ArrayLists

package in_2023_04_03;

import java.util.ArrayList;

public class BeeHive {
    private ArrayList<Bee> beeList;

    public BeeHive(int numBees) {
        this.beeList = new ArrayList<Bee>();
        for (int i = 0; i < numBees; i++) {
            this.beeList.add(new Bee("bee" + i));
        }
    }

    public void printBees() {
        for (Bee pszczola : this.beeList) {
            System.out.println(pszczola.getName());
        }
    }

    public static void main(String[] args) {
        BeeHive myHive = new BeeHive(365);
        myHive.printBees();
    }
}
