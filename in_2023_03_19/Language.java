// LEARN JAVA / INHERITANCE AND POLYMORPHISM / PROJECT / Language Families

package in_2023_03_19;

public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String langName, int nrOfUsers, String placesUsing, String order) {
        this.name = langName;
        this.numSpeakers = nrOfUsers;
        this.regionsSpoken = placesUsing;
        this.wordOrder = order;
    }

    public void getInfo() {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder);
    }

    // new experimental method for looking for a language that is spoken in a specific region ie. Poland
    public void findLanguageInRegion(String searchedRegion) {
        if (regionsSpoken.contains(searchedRegion)) {
            System.out.println("W miejscu " + searchedRegion + " they speak " + name + " among other languages");
        } else {
            System.out.println("Nie mam danych czy językiem " + name + " mówi się w " + searchedRegion);
        }
    }

    public static void main(String[] args) {
        Language polish = new Language("Polski", 37500000, "Poland, USA, Australia", "subject-verb-object");
        polish.getInfo();
        Language tzuti = new Mayan("Tzʼutujil", 63200);
        tzuti.getInfo();
        Language chinese = new SinoTibetan("Mandarin Chinese", 2000000000);
        chinese.getInfo();
        Language burmese = new SinoTibetan("Burmese", 327025113);
        burmese.getInfo();

        Language german, spanish;
        german = new Germanic("Niemiecki", "absolutnie pojebany ordnund muss sein");
        spanish = new Language("Hiszpański", 35000000, "Hiszpania, Ameryka Płd, USA", "simple");

        Language[] languages = {polish, tzuti, chinese, burmese, spanish, german};
        for (Language jezyk : languages) {
            // jezyk.getInfo();
            jezyk.findLanguageInRegion("USA");
        }
    }
}