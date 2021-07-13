package JavaPractive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);

        System.out.println("How many vehicles?");

        int vehicleAmount = scan.nextInt();
        List<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < vehicleAmount; i++) {

            System.out.println("what type of vehicle?");
            System.out.println("Car --> 1\nPlane --> 2\nBoat --> 3");
            int vehicleType = scan.nextInt();
            String engineType;

            System.out.println("The ID of the vehicle is " + i);
            System.out.println("What type of engine?");
            System.out.println("Electric --> 1\nGas --> 2");
            int typeNum = scan.nextInt();
            if (typeNum == 1) {
                engineType = "Electric";
            } else if (typeNum == 2) {
                engineType = "Gas";
            } else {
                engineType = "unknown";
            }

            System.out.println("What is the max amount of passengers?");
            int maxPassengers = scan.nextInt();

            switch (vehicleType) {

                case 1:

                    int carFuel = (int) Math.round(Math.random() * 6) + 8 + maxPassengers;
                    Engine carEngine = new Engine(engineType, carFuel);
                    Car car = new Car(i, carEngine, maxPassengers);
                    vehicles.add(car);
                    Car.addTire(car.tires, 4);
                    break;
                case 2:

                    int planeFuel = (int) Math.round(Math.random() * maxPassengers) + 100 + (maxPassengers / 5);
                    Engine planeEngine = new Engine(engineType, planeFuel);
                    Plane plane = new Plane(i, planeEngine, maxPassengers);
                    vehicles.add(plane);
                    Plane.addTire(plane.tires, 6);

                    break;
                case 3:

                    int boatFuel = (int) Math.round(Math.random() * (10 * maxPassengers)) + 5;
                    Engine boatEngine = new Engine(engineType, boatFuel);

                    System.out.println("what is max load of boat?");
                    int maxLoad = scan.nextInt();

//            System.out.println("how many passengers will be in the vehicle?");
//            int passengerAmount = scan.nextInt();
//            for (i = 0; i < passengerAmount; i++) {
//                Passenger passenger = new Passenger("generic passenger", 1);
//                Vehicle.addPassenger(vehicles.get(i).passengers, passenger);
//            }
                    vehicles.add(new Boat(i, boatEngine, maxPassengers, maxLoad));

                    break;
            }
        }

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getClass().getSimpleName() + " " + vehicle.ID + " " + vehicle.engine.type + " " + vehicle.maxPassengers);
        }
    }
}