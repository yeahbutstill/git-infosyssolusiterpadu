package com.yeahbutstill.infosys.service.impl;

import com.yeahbutstill.infosys.dto.Person;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PersonService {

    public String getName(String gender) {
        log.info("Fetching person name: {}", gender);
        Person person = new Person();

        if ("man".equals(gender)) {
            person.setName("Dani");
        } else {
            person.setName(("Maya"));
        }

        return person.getName();

    }

    public Person getNameV2(String gender) {

        log.info("Fetching person name: {}", gender);
        Person person = new Person();

        if ("man".equals(gender)) {
            person.setName("Dani");
        } else {
            person.setName("Maya");
        }

        return person;

    }

    public String getNameV3(String name) {

        log.info("Fetching person name: {}", name);
        String fullName = "not identified";

        if ("Dani".equals(name)) {
            fullName = "Dani Setiawan";
        } else if ("Maya".equals(name)) {
            fullName = "Maya Triyanti";
        }

        return fullName;
    }

}
