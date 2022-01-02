package com.in28minutes.rest.webservices.restwebservices.versioning;

public class Name {
    private String fistName;
    private String secondName;

    public Name() {
    }

    public Name(String fistName, String secondName) {
        this.fistName = fistName;
        this.secondName = secondName;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
