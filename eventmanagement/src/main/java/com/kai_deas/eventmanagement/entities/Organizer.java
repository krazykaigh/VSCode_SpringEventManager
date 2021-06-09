package com.kai_deas.eventmanagement.entities;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
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

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(id, ((Organizer) obj).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    // Undocumented code from Udemy Course
    public Long getResourceId() {
    return this.id;
}


}
