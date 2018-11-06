package com.example.userauth.jwt.userauthjwt.repository;

import com.example.userauth.jwt.userauthjwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User findByUsername(String username);

    User findByEmail(String username);
}
