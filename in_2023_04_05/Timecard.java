// LEARN JAVA: CONDITIONALS AND OPERATORS / Comparing Objects in Java

package in_2023_04_05;

class Timecard {
    public String firstname;
    public String lastname;
    public int date;
    public String id;

    public Timecard(String firstname, String lastname, int date, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.date = date;
        this.id = id;
    }

    public boolean equals(Timecard t) {
        return (t.date == this.date && t.id.equals(this.id));

        // uncomment method and write code here
    }

    public static void main(String[] args) {
        // declare and instantiate
        Timecard timecardSearch = new Timecard("Jennifer", "Smith", 11032020, "jSmith");
        Timecard timecard1 = new Timecard("Jennie", "Jones", 1102020, "jJones");
        Timecard timecard2 = new Timecard("Jennifer", "Tompkins", 11022020, "jTompkins");
        Timecard timecard3 = new Timecard("Jen", "Smith", 11032020, "jSmith");
        Timecard timecard4 = new Timecard("Jenny", "Lawrence", 11032020, "jLawrence");
        Timecard timecard5 = new Timecard("Jenn", "Williams", 11042020, "jWilliams");

        // comparisons
        System.out.println(timecardSearch.equals(timecard1));
        System.out.println(timecardSearch.equals(timecard2));
        System.out.println(timecardSearch.equals(timecard3));
        System.out.println(timecardSearch.equals(timecard4));
        System.out.println(timecardSearch.equals(timecard5));
    }
}
