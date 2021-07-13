package JavaPractive;

public class Tire {
    int diameter;
    int pressure;

    public Tire(int diameter) {
        this.diameter = diameter;
        this.pressure = 30;
    }

    public static void fill(Tire tire) {
        tire.pressure = 33;
    }
}
