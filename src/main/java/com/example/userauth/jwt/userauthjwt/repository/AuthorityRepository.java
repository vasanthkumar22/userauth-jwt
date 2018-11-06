package com.example.userauth.jwt.userauthjwt.repository;

import com.example.userauth.jwt.userauthjwt.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {

   Authority findByName(String name);
}
