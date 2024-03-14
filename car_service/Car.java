package org.example;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Car {
    private String model;
    private Engine engine;
    private Body body;
    private Wheels wheels;

    public void fixCar(RepairMessage message, Engine newEngine, Body newBody, Wheels newWheels) {
        if (message == RepairMessage.ENGINE_FAILURE) {
            this.setEngine(newEngine);
        } else if (message == RepairMessage.BODY_FAILURE) {
            this.setBody(newBody);
        } else if (message == RepairMessage.WHEELS_FAILURE) {
            this.setWheels(newWheels);
        } else {
            System.out.println("Failed :(");
        }
    }
}
