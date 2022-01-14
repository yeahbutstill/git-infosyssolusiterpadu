package com.yeahbutstill.infosys.dto.dev.to;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;

@Data
public class SmartphoneAnotherJson {

    private String brand;
    private Model model;

    @JsonCreator
    public SmartphoneAnotherJson(String brand, Model model) {
        this.brand = brand;
        this.model = model;
    }

    @Data
    static class Model {
        private String name;
        private String version;

        @JsonCreator
        public Model(String name, String version) {
            this.name = name;
            this.version = version;
        }
    }

}
