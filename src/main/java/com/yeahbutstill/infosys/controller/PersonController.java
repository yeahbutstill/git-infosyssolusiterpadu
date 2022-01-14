package com.yeahbutstill.infosys.controller;

import com.yeahbutstill.infosys.dto.Person;
import com.yeahbutstill.infosys.service.impl.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping(value = "/getpersonname")
    public String getPersonName(@RequestParam(value = "gender", defaultValue = "gender") String gender) {
        return personService.getName(gender);
    }

    @GetMapping(value = "/getpersonnamev2")
    public Person getPersonNameV2(@RequestParam(value = "gender", defaultValue = "gender") String gender) {
        return personService.getNameV2(gender);
    }

    @PostMapping(value = "/getpersonnamev3", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getPersonNameV3(@RequestBody() Person person) {
        return personService.getNameV3(person.getName());
    }

}
