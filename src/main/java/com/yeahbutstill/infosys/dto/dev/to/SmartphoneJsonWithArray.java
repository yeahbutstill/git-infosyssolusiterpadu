package com.yeahbutstill.infosys.dto.dev.to;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;

import java.util.List;

@Data
public class SmartphoneJsonWithArray {
    private String brand;
    private Model model;
    private List<String> features;

    @JsonCreator
    public SmartphoneJsonWithArray(String brand, Model model, List<String> features) {
        this.brand = brand;
        this.model = model;
        this.features = features;
    }

    @Data
    public static class Model {
        private String name;
        private String version;

        @JsonCreator
        public Model(String name, String version) {
            this.name = name;
            this.version = version;
        }
    }
}
