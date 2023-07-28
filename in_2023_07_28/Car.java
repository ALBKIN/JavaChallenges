package in_2023_07_28;

import java.io.*;

public class Car implements Serializable {
    private String make;
    private int year;
    private transient String model;
    private Engine engine;
    private Gears gears;
    private static final long serialVersionUID = 1L;

    public Car(String make, int year, String model, Gears gears) {
        this.make = make;
        this.year = year;
        this.model = model;
        this.gears = gears;
        this.engine = new Engine(2.4, 6);
    }

    // Custom Serialization methods to serialize class that doesn't implement Serialization
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.writeObject(this.make);
        stream.writeInt(this.year);
        stream.writeObject(this.model);
        stream.writeObject(this.engine);
        stream.writeInt(this.gears.getGearsNo());
        stream.writeBoolean(this.gears.getAutomatic());
    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        this.make = (String) stream.readObject();
        this.year = (int) stream.readInt();
        this.model = (String) stream.readObject();
        this.engine = (Engine) stream.readObject();
        int gears = (int) stream.readInt();
        boolean automatic = (boolean) stream.readBoolean();
        this.gears = new Gears(gears, automatic);
    }

    public String toString(){
        return String.format("Car make is: %s, \nCar year is: %d, \nCar model is: %s, \nGears: %s, \n%s, \nserialVersionUID: %d\n", this.make, this.year, this.model, this.gears, this.engine, serialVersionUID);
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Car toyota = new Car("Toyota", 2021, "Corolla", new Gears(6, true));
        Car honda = new Car("Honda", 2020, "Civic", new Gears(5, false));
        FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(toyota);
        objectOutputStream.writeObject(honda);

        FileInputStream fileInputStream = new FileInputStream("cars.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Car toyotaCopy = (Car) objectInputStream.readObject();
        Car hondaCopy = (Car) objectInputStream.readObject();

        boolean isSameObject = toyotaCopy == toyota;
        System.out.println("Toyota (Copy) - "+ toyotaCopy);
        System.out.println("Toyota (Original) - "+ toyota);
        System.out.println("Is same object: "+ isSameObject);
    }
}