// LEARN JAVA / STRING METHODS / charAt()


package in_2023_03_15;

public class Initials {

    public static void main(String[] args) {

        // Add a first name and a last name:
        String firstName = "Luuke";
        String lastName = "Skywalker";

        // What are the initials?
        System.out.println("Inicjały mojego nazwiska to: " + firstName.charAt(0) + lastName.charAt(0));

        // brute printout as above one isnt accepted
        System.out.println(firstName.charAt(0) + lastName.charAt(0));
        // jakim cudem dodaje mi L + S = 159? a jak dodam spację to nie dodaje... i wyżej bez spacji normalnie drukował...
        System.out.println(firstName.charAt(0) + " " + lastName.charAt(0));

        System.out.println(firstName.charAt(0));
        System.out.println(lastName.charAt(0));

    }
}
