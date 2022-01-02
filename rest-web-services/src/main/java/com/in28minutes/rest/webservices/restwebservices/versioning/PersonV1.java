package com.in28minutes.rest.webservices.restwebservices.versioning;

public class PersonV1 {
    private String Name;

    public PersonV1(String name) {
        Name = name;
    }

    public PersonV1() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

