package com.kai_deas.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;
import com.kai_deas.eventmanagement.entities.Participant;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {
    
}
