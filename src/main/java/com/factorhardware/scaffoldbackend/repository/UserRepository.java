package com.factorhardware.scaffoldbackend.repository;

import com.factorhardware.scaffoldbackend.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUserEmail(String email);
    List<User> findByLastName(String lastName);
    List<User> findByFirstName(String firstName);
    User findById(long id);
}
