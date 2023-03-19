// LEARN JAVA / INHERITANCE AND POLYMORPHISM / PROJECT / Language Families

package in_2023_03_19;

class SinoTibetan extends Language {

    SinoTibetan(String langName, int nrOfUsers) {
        super(langName, nrOfUsers, "Asia", "subject-object-verb");
        if (this.name.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }
}