package org.example;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(
                "BMW",
                new Engine(2996, "M57"),
                new Body(BodyColor.BLACK, BodyType.COUPE),
                new Wheels(240)
        );

        String message = String.format(
                "Car model: %s, Color: %s, Body: %s, Engine: %s - %dcm3, vMax Wheels: %d km/h",
                car1.getModel(),
                car1.getBody().getBodyColor(),
                car1.getBody().getBodyType(),
                car1.getEngine().getModel(),
                car1.getEngine().getCapacity(),
                car1.getWheels().getVMax()

        );
        System.out.println(message);
        }
    }