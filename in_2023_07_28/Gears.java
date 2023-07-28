package in_2023_07_28;

public class Gears {

    private int gearsNo;
    private boolean automatic;

    private Gears(int gearsNo, boolean automatic) {
        this.gearsNo = gearsNo;
        this.automatic = automatic;
    }

    public String toString() {
        return String.format("Gears number is:%d, Has automatic gearshift: %b", this.gearsNo, this.automatic);
    }
}
