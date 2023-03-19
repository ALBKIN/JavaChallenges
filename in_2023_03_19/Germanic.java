package in_2023_03_19;

class Germanic extends Language {
    public Germanic(String langName, String order) {
        super(langName, 75000000, "Germany, Austria, Switzerland", order);
    }

    @Override
    public void getInfo() {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder);
        System.out.println("Hande hoch!!1!!1");
    }
}
