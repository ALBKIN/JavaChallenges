// LEARN JAVA / DEBUGGING / Debugging Techniques

package in_2023_03_20;

import java.util.*;

public class AreaCalculator {

    public static void main(String[] args) {

        Scanner keybord = new Scanner(System.in);

        System.out.println("Shape Area Calculator");

        while (true) {

            System.out.println();
            System.out.println("-=-=-=-=-=-=-=-=-=-");
            System.out.println();
            System.out.println("1) Triangle");
            System.out.println("2) Rectangle");
            System.out.println("3) Circle");
            System.out.println("4) Quit");
            System.out.println();

            try {

                System.out.println("Which shape: ");
                int shape = keybord.nextInt();
                System.out.println();

                if (shape == 1) {
                    System.out.println("Base: ");
                    int base = keybord.nextInt();
                    System.out.println("Height");
                    int height = keybord.nextInt();
                    area_triangle(base, height);
                } else if (shape == 2) {
                    System.out.println("Length: ");
                    int length = keybord.nextInt();
                    System.out.println("Width");
                    int width = keybord.nextInt();
                    area_rectangle(length, width);
                } else if (shape == 3) {
                    System.out.println("Radius: ");
                    int radius = keybord.nextInt();
                    area_circle(radius);
                } else if (shape == 4) {
                    quit();
                    break;
                }
            } catch (InputMismatchException e) {
                System.err.println("Wprowadź poprawną cyfrę! ERROR: " +e.getMessage());
                break;

            }
        }
    }

    public static double area_triangle(int base, int height) {
        System.out.println();
        int A = (base * height) / 2;
        System.out.println("The area is " + A + ".");
        return A;
    }

    public static double area_rectangle(int length, int width) {
        System.out.println();
        int A = length * width;
        System.out.println("The area is " + A + ".");
        return A;
    }

    public static double area_circle(int radius) {
        System.out.println();
        double A = Math.PI * radius * radius;
        System.out.println("The area is " + A + ".");
        return A;
    }

    public static String quit() {
        System.out.println("Goodbye");
        return null;
    }
}
