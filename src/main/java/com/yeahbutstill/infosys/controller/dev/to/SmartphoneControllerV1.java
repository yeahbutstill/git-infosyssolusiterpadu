package com.yeahbutstill.infosys.controller.dev.to;

import com.yeahbutstill.infosys.dto.dev.to.SmartphoneJsonWithArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/apiv1")
public class SmartphoneControllerV1 {

    private static final Logger logger = LoggerFactory.getLogger(SmartphoneControllerV1.class);

    @PostMapping(value = "/smartphone")
    public ResponseEntity<SmartphoneJsonWithArray> addSmartphone(@RequestBody SmartphoneJsonWithArray smartphoneJsonWithArray) {
        logSmartPhone(smartphoneJsonWithArray);
        return ResponseEntity.ok(smartphoneJsonWithArray);
    }

    @PostMapping(value = "/smartphones")
    public ResponseEntity<List<SmartphoneJsonWithArray>> addSmartphones(@RequestBody List<SmartphoneJsonWithArray> smartphoneJsonWithArray) {
        smartphoneJsonWithArray.forEach(this::logSmartPhone);
        return ResponseEntity.ok(smartphoneJsonWithArray);
    }

    private void logSmartPhone(SmartphoneJsonWithArray smartphoneJsonWithArray) {
        logger.info("Received new smartphoneJson: " + smartphoneJsonWithArray.getBrand() + " " + smartphoneJsonWithArray.getModel().getName() + " " + smartphoneJsonWithArray.getModel().getVersion());
        logger.info("The feature of the smartphone are: " + String.join(", ", smartphoneJsonWithArray.getFeatures()));
    }

}
