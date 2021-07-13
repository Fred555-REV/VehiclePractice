package JavaPractive;

public class Engine {
    String type;    // electric/gas
    boolean isOn;
    int fuel;

    public Engine(String type, int fuel) {
        this.type = type;
        this.isOn = false;
        this.fuel = fuel;
    }

    public static void turnOn(Engine engine) {
        engine.isOn = true;
    }

    public static void turnOff(Engine engine) {
        engine.isOn = false;
    }
}
