package com.kai_deas.eventmanagement.entities;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@MappedSuperclass
public class AbstractEntity {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
    @JsonIgnore
    @CreationTimestamp
    @Column(updatable = false)
    protected Instant created;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Instant getCreated() {
        return this.created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

}
