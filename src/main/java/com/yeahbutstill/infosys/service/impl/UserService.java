package com.yeahbutstill.infosys.service.impl;

import com.yeahbutstill.infosys.exception.UserRequest;
import com.yeahbutstill.infosys.model.User;
import com.yeahbutstill.infosys.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new UserRequest(user);
    }
}
