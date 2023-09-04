// JAVA EXERCISE - NESTED CLASSES (SHADOWING)

package in_2023_09_04;

class Book {
    String type = "Nonfiction";

    // Nested inner class
    class Biography {
        String type = "Biography";

        public void print() {
            System.out.println(Book.this.type);
            System.out.println(type);
        }
    }
}

public class ShadowingBooks {
    public static void main(String[] args) {
        Book book = new Book();
        Book.Biography bio = book.new Biography();
        bio.print();
    }
}
