package com.yeahbutstill.infosys.dto.dev.to;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;

@Data
public class SmartphoneWrapper {

    private SmartphoneJsonWithArray smartphoneJsonWithArray;

    @JsonCreator
    public SmartphoneWrapper(SmartphoneJsonWithArray smartphoneJsonWithArray) {
        this.smartphoneJsonWithArray = smartphoneJsonWithArray;
    }
}
