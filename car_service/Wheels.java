package org.example;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Wheels {
    @Builder.Default
    private int vMax = 160;
}
