package com.yeahbutstill.infosys.service.impl;

import com.yeahbutstill.infosys.model.User;
import com.yeahbutstill.infosys.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public User getUser(Long id) {
        return userRepository.getById(id);
    }

}
