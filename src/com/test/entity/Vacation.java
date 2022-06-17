package com.test.entity;

import java.time.LocalDate;

public class Vacation {

    private LocalDate date;
    private int duration;
    private Person person;

    public Vacation(LocalDate date, int duration, Person person) {
        this.date = date;
        this.duration = duration;
        this.person = person;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
