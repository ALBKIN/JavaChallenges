// LEARN JAVA / LOOPS / Review

package in_2023_03_15;

import java.util.Arrays;
import java.util.ArrayList;

class Playground {

    public static void main(String[] args) {

        for (int i = 0; i < 28; i++) {
            System.out.println("Congrats on finishing Java Loops");
        }
        int wishes = 0;
        while (wishes < 3) {
            System.out.println("Your wish has been granted, mortal!");
            wishes++;
        }

        ArrayList<Double> wallet = new ArrayList<Double>();
        wallet.add(13.90);
        wallet.add(20.00);
        wallet.add(80.75);
        wallet.add(43.29);
        wallet.add(3.50);
        System.out.println(wallet.size());

        // policz najwyższy wpływ do portfela
        double highestIncome = 0;

        for (int i = 0; i < wallet.size(); i++) {
            if (wallet.get(i) > highestIncome) {
                highestIncome = wallet.get(i);
            }
        }
        System.out.println(highestIncome);

        // policz sumę w portfelu
        double incomeSum = 0;
        for (int i = 0; i < wallet.size(); i++) {
            incomeSum += wallet.get(i);
        }
        System.out.println(incomeSum);
    }
}
