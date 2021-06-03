package com.kai_deas.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;
import com.kai_deas.eventmanagement.entities.Organizer;

public interface OrganizerRepository extends CrudRepository<Organizer, Long> {
    
}