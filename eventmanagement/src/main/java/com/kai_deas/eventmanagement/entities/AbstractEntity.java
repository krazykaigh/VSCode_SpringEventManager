package com.kai_deas.eventmanagement.entities;

import java.time.Instant;

public class AbstractEntity {
    
    protected long id;
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
