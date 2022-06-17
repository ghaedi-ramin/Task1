package com.test.dao;

import com.test.entity.Person;

import java.util.List;

public class PersonnelDao {


    public void create(Person person){
        DataStore.AddPerson(person);
    }

    public void edit(){

    }

    public void delete(Person person){

        DataStore.deletePerson(person);
    }

    public List<Person> findAll(){
        return DataStore.findAll();
    }

}
