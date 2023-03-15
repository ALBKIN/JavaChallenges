// LEARN JAVA / STRING METHODS / concat()

package in_2023_03_15;

public class CombineNames {

    public static void main(String[] args) {

        // Add your first names:
        String firstName = "Allbert";
        String lastName = "Kowalski";

        // What's the full name?
        String fullName = firstName.concat(lastName);
        System.out.println(fullName);

        // or because above isnt accepted
        System.out.println(firstName.concat(" " + lastName));
    }

}