package com.kai_deas.eventmanagement.entities;

import java.util.Set;

import javax.persistence.OneToMany;

public class Organizer extends AbstractEntity {

    private String name;
    @OneToMany(mappedBy = "organizer")
    private Set<Event> event;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Event> getEvent() {
        return this.event;
    }

    public void setEvent(Set<Event> event) {
        this.event = event;
    }

}
