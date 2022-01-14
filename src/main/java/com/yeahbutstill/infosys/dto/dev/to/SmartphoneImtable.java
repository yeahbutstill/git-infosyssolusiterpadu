package com.yeahbutstill.infosys.dto.dev.to;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;

@Data
public class SmartphoneImtable {
    private final String brand;
    private final String model;

    @JsonCreator
    public SmartphoneImtable(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}
