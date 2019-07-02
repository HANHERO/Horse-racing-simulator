package com.alevel.java7.finalproject.horseracingsimulator.repository;

import com.alevel.java7.finalproject.horseracingsimulator.model.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<Users, Long> {

    List<Users> findByLogin(String login);


    List<Users> findById(Integer id);
}
