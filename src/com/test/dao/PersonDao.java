package com.test.dao;

import com.test.entity.Person;

import java.util.List;

public class PersonDao {


    public void create(Person person) {
        DataStore.AddPerson(person);
    }


    public void delete(Person person) {

        DataStore.deletePerson(person);
    }

    public List<Person> findAll() {
        return DataStore.findAll();
    }

//    public List<Person> searchByFamily() {
//        return DataStore.findByFamily();
//    }
//
//    public List<Person> searchById(int id) {
//        return DataStore.findById(id);
//
//    }
}
