package com.kai_deas.eventmanagement.entities;

public class Participant extends AbstractEntity {

    private String name;
    private String email;
    private String checkedIn;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCheckedIn() {
        return this.checkedIn;
    }

    public void setCheckedIn(String checkedIn) {
        this.checkedIn = checkedIn;
    }

}
