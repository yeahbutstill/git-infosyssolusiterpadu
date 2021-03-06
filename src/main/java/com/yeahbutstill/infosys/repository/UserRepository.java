package com.yeahbutstill.infosys.repository;

import com.yeahbutstill.infosys.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserName(String username);

    User getById(Long id);
}
