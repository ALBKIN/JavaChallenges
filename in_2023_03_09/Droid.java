// LEARN JAVA / BUILD A DROID

package in_2023_03_09;

public class Droid {

    int batteryLevel;
    String name;

    // constructor method
    public Droid(String droidName, int initialBattery) {
        name = droidName;
        batteryLevel = initialBattery = 100;
    }

    // toString() introduction method
    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    // task method
    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
        System.out.println("The task is tiring. Current battery level is: " + batteryLevel);
    }

    // energy report method
    public void energyReport() {
        System.out.println(name + "'s battery status: " + batteryLevel + "% and falling...");
    }

    /* energy transfer method - chwilowonie działa, pewnie jest jakaś prosta metoda
    wskazywania odnośników instancji, ale chwilowo mi uciekła

    public void energyTransfer(name, name); {
      name.batteryLevel = name.batteryLevel;
      System.out.println("Batteries have been exchanged!");
    }
    */
    // main method
    public static void main(String[] args) {
        Droid Codey = new Droid("Codey", 100);
        System.out.println(Codey);
        Codey.performTask("dancing");
        Codey.performTask("asking for meaning of life");
        Droid Bender = new Droid("Bender", 100);
        System.out.println("\n" + Bender);
        Bender.performTask("looking for black jack and hookers");
        Codey.performTask("teaming up with Bender");

        /* hihi haha hoho poziom baterii osobno dla kazdego droida dziala jak nalezy,
        ale czy w obu metodach? Let's check
         */
        Codey.energyReport();
        Bender.energyReport();
        Bender.performTask("draining energy");
        Bender.energyReport();

        // ou je bejbe, no to teraz transfer energii (nie działa chlip, rozkminię to póżniej)
    }
}
