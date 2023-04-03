// Java Code Challenge: Loops Involving ArrayLists

package in_2023_04_03;

import java.util.ArrayList;

public class BeeHive1 {
    private ArrayList<Bee> beeList;

    public BeeHive1(int numBees) {
        this.beeList = new ArrayList<Bee>();
        for (int i = 0; i < numBees; i++) {
            this.beeList.add(new Bee("bee" + i));
        }
    }

    public ArrayList<Bee> getBeeList() {
        return this.beeList;
    }

    public void leaveHome(String beeName) {
        for ( Bee b : this.beeList) {
            if (b.getName().equals(beeName)) {
                b.leaveHome();
            }
        }

    }

    public static void main(String[] args) {
        BeeHive1 myHive = new BeeHive1(365);
        myHive.leaveHome("bee43");

        // Print bee's status to make sure it is no longer home
        System.out.println(myHive.beeList.get(43).isHome());
    }
}

