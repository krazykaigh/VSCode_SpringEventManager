package com.kai_deas.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;
import com.kai_deas.eventmanagement.entities.Event;

public interface EventRepository extends CrudRepository<Event, Long> {
    
}
