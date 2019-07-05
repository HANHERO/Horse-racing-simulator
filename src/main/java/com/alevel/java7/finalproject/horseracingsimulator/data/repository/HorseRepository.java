package com.alevel.java7.finalproject.horseracingsimulator.data.repository;

import com.alevel.java7.finalproject.horseracingsimulator.data.model.Horses;
import org.springframework.data.repository.CrudRepository;

public interface HorseRepository extends CrudRepository<Horses, Long> {

//    @Query("select u from Users u where u.email like '%@gmail.com%'")
//    List<Users> findWhereEmailIsGmail();
//
//    @Query(value = "select * from users where name like '%a%'", nativeQuery = true)
//    List<Users> findWhereNameHaveLetterA();
//


}
