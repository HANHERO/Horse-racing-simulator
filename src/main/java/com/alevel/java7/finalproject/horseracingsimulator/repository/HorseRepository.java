package com.alevel.java7.finalproject.horseracingsimulator.repository;

import com.alevel.java7.finalproject.horseracingsimulator.model.Horses;
import com.alevel.java7.finalproject.horseracingsimulator.model.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HorseRepository extends CrudRepository<Horses, Long> {

//    @Query("select u from Users u where u.email like '%@gmail.com%'")
//    List<Users> findWhereEmailIsGmail();
//
//    @Query(value = "select * from users where name like '%a%'", nativeQuery = true)
//    List<Users> findWhereNameHaveLetterA();
//


}
