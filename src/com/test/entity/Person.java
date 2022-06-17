package com.test.entity;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String name , String family){
        this.firstName = name;
        this.lastName = family;
    }
    public Person(){

    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.lastName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
