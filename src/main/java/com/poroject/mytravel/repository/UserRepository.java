package com.poroject.mytravel.repository;

import com.poroject.mytravel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
