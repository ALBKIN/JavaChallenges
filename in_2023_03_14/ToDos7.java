// LEARN JAVA // ARRAYLISTS / Review

package in_2023_03_14;

import java.util.ArrayList;

public class ToDos7 {
    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<String>();

        books.add("Lord of the Rings");
        books.add("Two Towers");
        books.add(1, "Zakładka sprawdzająca komendę pozycjonowania w ArrayList");

        System.out.println(books + "\n");

        System.out.println("Aktualna ilość książek w tablicy wynosi: " + books.size());

        books.remove(1);
        System.out.println("Po usunięciu testowej pozycji ilość książek wynosi: " + books.size());

        books.add("Tintin");
        books.add("Tajemnice programowania w Javie");
        System.out.println(books.get(3));
        System.out.println("Książka Tintin ma następującą pozycję w tablicy: " + books.indexOf("Tintin"));

    }
}
