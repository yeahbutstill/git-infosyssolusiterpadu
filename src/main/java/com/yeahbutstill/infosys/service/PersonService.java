package com.yeahbutstill.infosys.service;

import com.yeahbutstill.infosys.dto.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public String getName(String gender) {

        Person person = new Person();

        if ("man".equals(gender)) {
            person.setName("Dani");
        } else {
            person.setName(("Maya"));
        }

        return person.getName();

    }

}
