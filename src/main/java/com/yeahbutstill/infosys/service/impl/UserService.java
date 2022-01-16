package com.yeahbutstill.infosys.service.impl;

import com.yeahbutstill.infosys.model.User;
import com.yeahbutstill.infosys.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(Long id) {
        return userRepository.getById(id);
    }

}
