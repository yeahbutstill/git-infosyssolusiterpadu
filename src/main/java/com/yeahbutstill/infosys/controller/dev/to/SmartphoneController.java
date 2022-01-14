package com.yeahbutstill.infosys.controller.dev.to;

import com.yeahbutstill.infosys.dto.dev.to.SmartphoneAnotherJson;
import com.yeahbutstill.infosys.dto.dev.to.SmartphoneImtable;
import com.yeahbutstill.infosys.dto.dev.to.SmartphoneJsonWithArray;
import com.yeahbutstill.infosys.dto.dev.to.SmartphoneMtable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;


@RestController
@RequestMapping(value = "/api")
public class SmartphoneController {
    private static final Logger logger = LoggerFactory.getLogger(SmartphoneController.class);

    @PostMapping(value = "/smartphone")
    public ResponseEntity<SmartphoneMtable> addSmartphone(@RequestBody SmartphoneMtable smartphoneMtable) {
        logger.info("Received new smartphoneMtable: " + smartphoneMtable.getBrand() + " " + smartphoneMtable.getModel());
        return ResponseEntity.ok(smartphoneMtable);
    }

    @PostMapping(value = "/smartphonev1")
    public ResponseEntity<SmartphoneImtable> addSmartphoneV1(@RequestBody SmartphoneImtable smartphoneImtable) {
        logger.info("Received new smartphoneImtable: " + smartphoneImtable.getBrand() + " " + smartphoneImtable.getModel());
        return ResponseEntity.ok(smartphoneImtable);
    }

    @PostMapping(value = "/smartphonev2")
    public ResponseEntity<SmartphoneAnotherJson> addSmartphoneV2(@RequestBody SmartphoneAnotherJson smartphoneAnotherJson) {
        logger.info("Received new smartphoneAnotherJson: " + smartphoneAnotherJson.getBrand() + " " + smartphoneAnotherJson.getModel());
        return ResponseEntity.ok(smartphoneAnotherJson);
    }

    @PostMapping(value = "/smartphonev3")
    public ResponseEntity<SmartphoneJsonWithArray> addSmartphoneV3(@RequestBody SmartphoneJsonWithArray smartphoneJsonWithArray) {
        logger.info("Received new smartphoneJson: " + smartphoneJsonWithArray.getBrand() + " " + smartphoneJsonWithArray.getModel().getName() + " " + smartphoneJsonWithArray.getModel().getVersion());
        logger.info("The feature of the smartphone are: " + smartphoneJsonWithArray.getFeatures().stream().collect(Collectors.joining(", ")));
        return ResponseEntity.ok(smartphoneJsonWithArray);
    }
}
