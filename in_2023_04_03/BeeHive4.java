// Java Code Challenge: Loops Involving ArrayLists

package in_2023_04_03;

import java.util.ArrayList;

public class BeeHive4 {
    private ArrayList<Bee> beeList;

    public BeeHive4(int numBees) {
        this.beeList = new ArrayList<Bee>();
        for (int i = 0; i < numBees; i++) {
            this.beeList.add(new Bee("bee" + i));
        }
    }

    public ArrayList<Bee> getBeeList() {
        return this.beeList;
    }

    public void renameBees(ArrayList<String> newNames) {
        int numNamesToAssign = this.beeList.size();
        if (newNames.size() < this.beeList.size()) {
            numNamesToAssign = newNames.size();
        }
        for (int i = 0; i < numNamesToAssign; i++) {
            this.beeList.get(i).setName(newNames.get(i));
        }
    }

    public static void main(String[] args) {
        BeeHive4 myHive = new BeeHive4(3);
        ArrayList<String> newNames = new ArrayList<String>();
        newNames.add("bob");
        newNames.add("macey");
        newNames.add("anna");

        myHive.renameBees(newNames);

        // Print out the elements in the bee list to make sure the new bees were added
        for (Bee b : myHive.beeList) {
            System.out.println(b.getName());
        }
    }
}


