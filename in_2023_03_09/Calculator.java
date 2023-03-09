// LEARN JAVA / A BASIC CALCULATOR:

/*
A simple calculator program with functions of:
addition, substraction, multiplication, division, modulo
*/

package in_2023_03_09;

// class
public class Calculator {

    // constructor method
    public Calculator() {
    }

    // add method
    public int add(int a, int b) {
        return a + b;
    }

    // substract method
    public int subtract(int a, int b) {
        return a - b;
    }

    // ,ultiply method
    public int multiply(int a, int b) {
        return a * b;
    }

    // division method
    public int divide(int a, int b) {
        return a / b;
    }

    // modulo method
    public int modulo(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println("Wynik dodawania 5 + 7 = " + myCalculator.add(5, 7));
        System.out.println("Wynik odejmowania 45 - 11 = " + myCalculator.subtract(45, 11));
    }
}
