package com.test.entity;

public class Person {
    private int personId;
    private String firstName;
    private String lastName;

    public Person(int id,String name , String family){
        this.personId = id;
        this.firstName = name;
        this.lastName = family;
    }
    public Person(int id){
        this.personId = id;
    }
    public Person(String family){
        this.lastName = family;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
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
