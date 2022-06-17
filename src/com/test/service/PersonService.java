package com.test.service;

import com.test.dao.PersonnelDao;
import com.test.entity.Person;

import java.util.List;

public class PersonService {

    public void createPerson(Person person){
        PersonnelDao personnelDao = new PersonnelDao();
        if (canSavePerson(person)){
            personnelDao.create(person);
            System.out.println("person added");
        }else {
            System.out.println("error");
        }
    }

    public void deletePerson(Person person){
        PersonnelDao personnelDao = new PersonnelDao();
        personnelDao.delete(person);
        System.out.println("delete person");
    }


    private boolean canSavePerson(Person person) {
        PersonnelDao personnelDao = new PersonnelDao();
        List<Person> personList = personnelDao.findAll();

        for (Person p:personList) {
            if (p.getName().equals(person.getName()) &&
                    p.getLastName().equals(person.getLastName())){
                return false;
            }
        }

        return true;
    }

}
