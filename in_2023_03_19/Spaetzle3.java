package in_2023_03_19;

class Spaetzle3 extends Noodle3 {

    Spaetzle3() {
        super(3.0, 1.5, "irregular", "eggs, flour, salt");
        this.texture = "lumpy and liquid";
    }

    // Add the new cook() method below:
    @Override
    public void cook() {
        System.out.println("Grinding or scraping dough.");
        System.out.println("Boiling.");
        this.texture = "cooked";
    }
}


