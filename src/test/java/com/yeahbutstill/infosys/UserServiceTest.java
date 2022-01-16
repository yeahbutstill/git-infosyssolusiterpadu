package com.yeahbutstill.infosys;

import com.yeahbutstill.infosys.model.User;
import com.yeahbutstill.infosys.repository.UserRepository;
import com.yeahbutstill.infosys.service.impl.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.ArgumentMatchers.anyLong;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @MockBean
    @Autowired
    private UserRepository userRepository;

    @BeforeEach
    public void init() {
        Mockito.when(userRepository.getById(anyLong())).thenReturn(new User());
    }

    @Test
    void getUserShouldNotNull() {

        User user = userService.getUser(12L);
        Assertions.assertNotNull(userService.getUser(1L));

    }

    @Test
    void getUserShouldNull() {

        User user = userService.getUser(null);
        Assertions.assertNull(userService.getUser(null));

    }

}
