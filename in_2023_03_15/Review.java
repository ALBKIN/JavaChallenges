// LEARN JAVA / STRING METHODS / Review

package in_2023_03_15;

public class Review {

    public static void main(String[] args) {
        String testowy = "DupadUpa duPadu dupa sama samadupA burabura";
        String doklejka = "Chuj dUuPa KURWA ciPA";

        System.out.println("Ilość znaków w String testowy to: " + testowy.length());

        System.out.println("Ilość znaków w String doklejka to: " + doklejka.length());

        System.out.println(testowy.concat(" " + doklejka));
        System.out.println("Łącznie :" + (testowy.concat(" " + doklejka)).length());
        String merge = testowy.concat(" " + doklejka);

        System.out.println("Pierwsza dupa zaczyna się od znaku nr: " + testowy.indexOf("dupa"));

        System.out.println("Pierwsze C w stringu jest tu: " +  merge.indexOf("C"));

        // charAt()
        System.out.println("Znak numer 45 to: " +  merge.charAt(45));
        System.out.println("Znak numer 46 to: " +  merge.charAt(46));
        System.out.println("Znak numer 47 to: " +  merge.charAt(47));

        // equals() / equalsIgnoreCase()
        System.out.println(testowy.equals(merge));
        System.out.println(merge.compareToIgnoreCase(doklejka));

        // substring()
        System.out.println(merge.substring(33, 42));

        // toUpperCase()
        System.out.println(merge.toUpperCase());

    }
}
