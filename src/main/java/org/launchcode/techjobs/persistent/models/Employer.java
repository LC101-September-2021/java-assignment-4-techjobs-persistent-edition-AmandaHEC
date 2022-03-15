package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.Valid;

@Entity
public class Employer extends AbstractEntity {


@Valid
private String location;

    public Employer(){}


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
