package com.kai_deas.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;
import com.kai_deas.eventmanagement.entities.Venue;

public interface VenueRepository extends CrudRepository<Venue, Long> {
    
}