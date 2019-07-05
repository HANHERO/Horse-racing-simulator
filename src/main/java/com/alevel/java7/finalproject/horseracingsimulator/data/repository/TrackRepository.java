package com.alevel.java7.finalproject.horseracingsimulator.data.repository;

import com.alevel.java7.finalproject.horseracingsimulator.data.model.Tracks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TrackRepository extends CrudRepository<Tracks, Long> {

}