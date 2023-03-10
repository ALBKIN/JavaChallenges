// LEARN JAVA / CONDITIONALS OPERATORS / Combining Conditional Operators

package in_2023_03_10;

public class Operators {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;

        boolean ex1 = !(a == 7 && (b >= a || a != a));
        // wynik będzie: !(false && false || false) = !(false && false) = !(false) = true
        System.out.println(ex1);

        boolean ex2 = a == b || !(b > 3);
        // wynik będzie: false || !(false) = false || true = true
        System.out.println(ex2);

        boolean ex3 = !(b <= a && b != a + b);
        // wynik będzie: !(true && true) = !(true) = false
        System.out.println(ex3);
    }
}
