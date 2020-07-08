package com.bearwithus.Project_Bear_With_Us_Login.repository;

import com.bearwithus.Project_Bear_With_Us_Login.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface userRepository extends MongoRepository<User, String> {

    List<User> findAll();
}
