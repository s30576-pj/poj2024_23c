package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(
                "BMW",
                new Engine(2996, "M57"),
                new Body(BodyColor.BLACK, BodyType.SEDAN),
                new Wheels(240)
        );
        Car car2 = new Car(
                "Toyota",
                new Engine(3000, "2JZ"),
                new Body(BodyColor.WHITE, BodyType.COUPE),
                new Wheels(270)
        );
        Car car3 = new Car(
                "Volkswagen",
                new Engine(2000, "EA888"),
                new Body(BodyColor.RED, BodyType.HATCHBACK),
                new Wheels(220)
        );

        List<Car> cars = new ArrayList<>(List.of(car1, car2, car3));

        Engine newEngine = new Engine(4000, "N63B44");
        cars.get(0).fixCar(RepairMessage.ENGINE_FAILURE, newEngine, null, null);

        for (Car car : cars) {
            String message = String.format(
                    "Car model: %s, Color: %s, Body: %s, Engine: %s - %dcm3, vMax Wheels: %d km/h",
                    car.getModel(),
                    car.getBody().getBodyColor(),
                    car.getBody().getBodyType(),
                    car.getEngine().getModel(),
                    car.getEngine().getCapacity(),
                    car.getWheels().getVMax()

            );
            System.out.println(message);
        }

        // AS PART OF THE TESTS
        processCarsWithForEach(cars);
        processCarsWithForLoop(cars);
        processCarsWithStream(cars);

        System.out.println("e");
    }

    /**
     * Process cars using a foreach loop.
     * For each car in the list, calls the fixCar method.
     * to fix any damage to the engine.
     */
    public static void processCarsWithForEach(List<Car> cars) {
        for (Car car : cars) {
            car.fixCar(RepairMessage.ENGINE_FAILURE, new Engine(4000, "N63B44"), null, null);
        }
    }

    /**
     * Process cars using a for loop.
     * For each car in the list, calls the fixCar method.
     * to fix any damage to the engine.
     */
    public static void processCarsWithForLoop(List<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            cars.get(i).fixCar(RepairMessage.ENGINE_FAILURE, new Engine(4000, "N63B44"), null, null);
        }
    }

    /**
     * Processes cars using streams.
     * Uses Java streams to iterate through each car.
     * and calls the fixCar method for each one to fix
     * any damage to the engine.
     */
    public static void processCarsWithStream(List<Car> cars) {
        cars.stream().forEach(car -> car.fixCar(RepairMessage.ENGINE_FAILURE, new Engine(4000, "N63B44"), null, null));
    }
}