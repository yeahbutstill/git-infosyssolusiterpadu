package com.yeahbutstill.infosys.controller.dev.to;

import com.yeahbutstill.infosys.dto.dev.to.SmartphoneJsonWithArray;
import com.yeahbutstill.infosys.dto.dev.to.SmartphoneWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;


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

    @PostMapping("/smartphone1")
    public ResponseEntity<SmartphoneWrapper> addSmartphone1(@RequestBody SmartphoneWrapper smartphoneWrapper) {
        logger.info("Received new smartphone: " + smartphoneWrapper.getSmartphoneJsonWithArray().getBrand() + " " + smartphoneWrapper.getSmartphoneJsonWithArray().getModel().getName() + " " + smartphoneWrapper.getSmartphoneJsonWithArray().getModel().getVersion());
        logger.info("The features of the smartphone are " + smartphoneWrapper.getSmartphoneJsonWithArray().getFeatures().stream().collect(Collectors.joining(", ")));
        return ResponseEntity.ok(smartphoneWrapper);
    }

    private void logSmartPhone(SmartphoneJsonWithArray smartphoneJsonWithArray) {
        logger.info("Received new smartphoneJson: " + smartphoneJsonWithArray.getBrand() + " " + smartphoneJsonWithArray.getModel().getName() + " " + smartphoneJsonWithArray.getModel().getVersion());
        logger.info("The feature of the smartphone are: " + String.join(", ", smartphoneJsonWithArray.getFeatures()));
    }

}
