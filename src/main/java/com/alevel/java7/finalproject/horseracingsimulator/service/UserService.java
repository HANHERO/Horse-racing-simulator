package com.alevel.java7.finalproject.horseracingsimulator.service;

import com.alevel.java7.finalproject.horseracingsimulator.data.model.Users;
import com.alevel.java7.finalproject.horseracingsimulator.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {
//    @Autowired
    UserRepository userRepository;


    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void createUsers(Users users) {
        userRepository.save(users);
    }

}
