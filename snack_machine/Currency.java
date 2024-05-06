package org.example;

import lombok.*;

@AllArgsConstructor
@Getter
public enum Currency {
    PLN(1.0),
    EUR(4.5),
    GBP(5.0),
    USD(4.0);

    private final double course;
}
