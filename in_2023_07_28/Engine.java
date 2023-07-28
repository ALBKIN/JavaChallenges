package in_2023_07_28;

import java.io.Serializable;

public class Engine implements Serializable {
    private double liters;
    private int cylinders;

    public Engine(double liters, int cylinders) {
        this.liters = liters;
        this.cylinders = cylinders;
    }

    public String toString() {
        return String.format("Engine liters is:%f, Engine cylinders is: %d", this.liters, this.cylinders);
    }
}
