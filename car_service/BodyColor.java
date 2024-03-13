package org.example;

import lombok.*;

@Getter
@AllArgsConstructor
public enum BodyColor {

    RED("#FF0000"),
    WHITE("#FFFFFF"),
    BLACK("#000000");

    private final String hexColor;
}

