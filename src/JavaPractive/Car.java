package JavaPractive;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
    List<Tire> tires;

    public Car(int ID, Engine engine, int maxPassengers) {
        super(ID, engine, "Car", true, false, false, false, maxPassengers);
        this.tires = new ArrayList<>();
    }

}
