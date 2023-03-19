// LEARN JAVA / INHERITANCE AND POLYMORPHISM / PROJECT / Language Families

package in_2023_03_19;

class Mayan extends Language {

    Mayan(String langName, int nrOfUsers) {
        super(langName, nrOfUsers, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo() {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder);
        System.out.println("Fun fact: " + name + " is an ergative language");
    }
}