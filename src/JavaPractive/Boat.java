package JavaPractive;

import java.util.List;

public class Boat extends Vehicle {
    int maxLoad;

    public Boat(int ID, Engine engine, int maxPassengers, int maxLoad) {
        super(ID, engine, maxPassengers);
        this.type = "Boat";
        this.isLand = false;
        this.isWater = true;
        this.isAir = false;
        this.isSpace = false;
        this.maxLoad = maxLoad;
    }
    public static void addPassenger(List<Passenger> passengers, Passenger passenger) {
        passengers.add(passenger);
    }

    public static void removePassenger(List<Passenger> passengers, Passenger passenger) {
        passengers.remove(passenger);

    }
}
