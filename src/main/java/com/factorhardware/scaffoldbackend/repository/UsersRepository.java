package com.factorhardware.scaffoldbackend.repository;

import com.factorhardware.scaffoldbackend.model.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface UsersRepository extends CrudRepository<Users, Long> {
    List<Users> findByUserEmail(String email);
    Users findByLastName(String lastName);
    List<Users> findByFirstName(String firstName);
    Users findById(long id);
}
