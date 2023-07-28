package in_2023_07_28;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Car implements Serializable {
    private String make;
    private int year;
    private static final long serialVersionUID = 1L;
    private transient String model;
    private Engine engine;

    public Car(String make, int year, String model) {
        this.make = make;
        this.year = year;
        this.model = model;
        this.engine = new Engine(2.4, 6);
    }

    public String toString(){
        return String.format("Car make is: %s, Car year is: %d, Car model is: %s, %s, serialVersionUID: %d", this.make, this.year, this.model, this.engine, serialVersionUID);
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Car toyota = new Car("Toyota", 2021, "Corolla");
        Car honda = new Car("Honda", 2020, "Civic");
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