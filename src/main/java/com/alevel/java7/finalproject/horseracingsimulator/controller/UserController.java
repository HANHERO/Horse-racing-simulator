package com.alevel.java7.finalproject.horseracingsimulator.controller;

import com.alevel.java7.finalproject.horseracingsimulator.model.Users;
import com.alevel.java7.finalproject.horseracingsimulator.repository.UserRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/save")
    public String save() {
        userRepository.save(new Users("sda", "sdafdas"));

        return "Done!";
    }

    @GetMapping("/users")
    public List<Users> getAllUsers() {
        return (List<Users>) userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public Users getUserByID(@PathVariable Long id) {
        Optional<Users> optStudent = userRepository.findById(id);
        if (optStudent.isPresent()) {
            return
                    optStudent.get();
        } else {
            return optStudent.get();
            //new Exeption
        }
    }

}
