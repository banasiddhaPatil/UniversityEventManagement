package com.geekster.UniversityEventManagement.repostroy;


import com.geekster.UniversityEventManagement.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEventRepo extends CrudRepository<Event,Integer> {

}
