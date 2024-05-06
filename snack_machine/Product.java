package org.example;

import lombok.*;

@Getter
@AllArgsConstructor
public enum Product {
    CHIPS(1, "Chips", 5.00),
    RED_BULL(2, "Red Bull", 7.00),
    COCA_COLA(3, "Coca Cola", 4.00),
    SEVEN_DAYS(4, "Seven Days", 3.50),
    SNICKERS(5, "Snickers", 2.50);

    private final int number;
    private final String name;
    private final double price;
}