package JavaPractive;

import java.util.ArrayList;
import java.util.List;

public class Plane extends Vehicle {
    List<Tire> tires;
    boolean isLanding;

    public Plane(int ID, Engine engine, int maxPassengers) {
        super(ID, engine, maxPassengers);
        this.type = "Plane";
        this.isLand = false;
        this.isWater = false;
        this.isAir = true;
        this.isSpace = false;
        this.passengers = new ArrayList<>();
        this.tires = new ArrayList<>();
        this.isLanding = false;
    }
    public static void toggleLanding(Plane plane) {
        plane.isLanding = !plane.isLanding;

    }

}
