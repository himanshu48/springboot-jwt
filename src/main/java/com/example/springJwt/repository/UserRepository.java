package com.example.springJwt.repository;

import com.example.springJwt.model.ApplicationUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<ApplicationUser, Long> {
    ApplicationUser findByUserName(String userName);
}
