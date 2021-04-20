package br.uece.eesdevops.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Tariff {

    ZONE_A_ONCE(6.0, "A"),
    ZONE_A_DAY(10.0, "A"),
    ZONE_A_WEEK(30.0, "A"),
    ZONE_A_MONTH(130.0, "A"),
    ZONE_B_ONCE(7.0, "B"),
    ZONE_B_DAY(12.0, "B"),
    ZONE_B_WEEK(45.0, "B"),
    ZONE_B_MONTH(170.0, "B");

    private Double value;
    private String zone;
}
