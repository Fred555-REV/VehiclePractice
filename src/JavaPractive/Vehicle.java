package JavaPractive;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Vehicle {
    int ID;
    Engine engine;
    String type;
    boolean isLand;
    boolean isWater;
    boolean isAir;
    boolean isSpace;
    int maxPassengers;
    List<Passenger> passengers;

    public Vehicle(int ID, Engine engine, String type, boolean isLand, boolean isWater, boolean isAir, boolean isSpace, int maxPassengers) {
        this.ID = ID;
        this.engine = engine;
        this.type = type;
        this.isLand = isLand;
        this.isWater = isWater;
        this.isAir = isAir;
        this.isSpace = isSpace;
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public Vehicle(int ID, Engine engine, int maxPassengers) {
        this.ID = ID;
        this.engine = engine;
        this.maxPassengers = maxPassengers;
    }

    public static void turnOn(Vehicle vehicle) {
        Engine.turnOn(vehicle.engine);
    }

    public static void turnOff(Vehicle vehicle) {
        Engine.turnOff(vehicle.engine);
    }

    public static void addPassenger(List<Passenger> passengers, Passenger passenger) {
        passengers.add(passenger);
    }

    public static void removePassenger(List<Passenger> passengers, Passenger passenger) {
        passengers.remove(passenger);

    }

    public static void addTire(List<Tire> tires, int amount) {
        for (int i = 0; i < amount; i++) {
            Tire tire = new Tire(20);
            tires.add(tire);
        }
    }

    public static void removeTire(List<Tire> tires, int index) {
        tires.remove(index);
    }

//    public static void replaceTire(List<Tire> tires, int index) {
//        tires.remove(index);
//        tires.add(index, new Tire(20));
//    }

}
