package com.yeahbutstill.infosys.controller;

import com.yeahbutstill.infosys.dto.Data;
import com.yeahbutstill.infosys.dto.Person;
import com.yeahbutstill.infosys.service.impl.PersonServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class PersonController {

    private final PersonServiceImpl personServiceImpl;

    @GetMapping(value = "/getpersonname")
    public String getPersonName(@RequestParam(value = "gender", defaultValue = "gender") String gender) {
        return personServiceImpl.getName(gender);
    }

    @GetMapping(value = "/getpersonnamev2")
    public Person getPersonNameV2(@RequestParam(value = "gender", defaultValue = "gender") String gender) {
        return personServiceImpl.getNameV2(gender);
    }

    @PostMapping(value = "/getpersonnamev3", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getPersonNameV3(@RequestBody() Person person) {
        return personServiceImpl.getNameV3(person.getName());
    }

    @PostMapping(value = "/getpersonage", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getPersonV1(@RequestBody() Person person, Data data) {
        return personServiceImpl.getNameAndAge(person.getName(), String.valueOf(data.getAge()));
    }

//    @PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public String register(@RequestBody() UserRequest userRequest) {
//
//        return personServiceImpl.register(userRequest);
//
//    }

}
