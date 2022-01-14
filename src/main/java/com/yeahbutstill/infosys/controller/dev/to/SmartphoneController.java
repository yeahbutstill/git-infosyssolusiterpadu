package com.yeahbutstill.infosys.controller.dev.to;

import com.yeahbutstill.infosys.dto.dev.to.Smartphone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api")
public class SmartphoneController {
    private static final Logger logger = LoggerFactory.getLogger(SmartphoneController.class);

    @PostMapping(value = "/smartphone")
    public ResponseEntity<Smartphone> addSmartphone(@RequestBody Smartphone smartphone) {
        logger.info("Received new smartphone: " + smartphone.getBrand() + "" + smartphone.getModel());
        return ResponseEntity.ok(smartphone);
    }
}
