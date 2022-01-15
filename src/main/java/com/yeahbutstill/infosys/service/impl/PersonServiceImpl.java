package com.yeahbutstill.infosys.service.impl;

import com.yeahbutstill.infosys.dto.Person;
import com.yeahbutstill.infosys.model.User;
import com.yeahbutstill.infosys.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
@RequiredArgsConstructor
@Slf4j
public class PersonServiceImpl {

    private final UserRepository userRepository;

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

    public String getNameAndAge(String name, String yearOfBirth) {
        log.info("Fetching person and calculate birthday to result age: {}", name, yearOfBirth);
        LocalDate today = LocalDate.now();
        Period period = Period.between(today, LocalDate.ofYearDay(Integer.parseInt(yearOfBirth), 1988));

        return String.valueOf(period.getYears());
    }

    public String register(UserRequest userRequest) {

        User existUser = userRepository.findByUserName(userRequest.getUsername());

        if (existUser != null) {
            return "Register failed, username is already exist";
        }

        User user = new User();
        user.setUserName(userRequest.getUsername());
        user.setPassWord(userRequest.getPassword());
        userRepository.save(user);

        return "Register Success !";
    }
}
