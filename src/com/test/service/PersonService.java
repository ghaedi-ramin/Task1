package com.test.service;

import com.test.dao.PersonDao;
import com.test.entity.Person;

import java.util.List;

public class PersonService {

public void showAll(){
    PersonDao personDao = new PersonDao();
    for (Person p : personDao.findAll()) {
                    System.out.println(p.getPersonId() + " " +p.getName() + " " + p.getLastName());
                }
}

    public void createPerson(Person person){
        PersonDao personnelDao = new PersonDao();
        if (canSavePerson(person)){
            personnelDao.create(person);
            System.out.println("person added");
        }else {
            System.out.println("error");
        }
    }

    public void deletePerson(Person person){
        PersonDao personDao = new PersonDao();
        personDao.delete(person);
        System.out.println("delete person");
    }

    public void searchPersonByID(int id){

    PersonDao personDao = new PersonDao();
        for (Person p : personDao.findAll()) {
                            if (id == p.getPersonId())
                                System.out.println(p.getPersonId() + " " + p.getName() + " " + p.getLastName());
                        }
    }

    public void searchPersonByFamily(String family){

        PersonDao personDao = new PersonDao();
        for (Person p : personDao.findAll()) {
                            if (p.getLastName() .equals( family))
                                System.out.println(p.getPersonId() + " " + p.getName() + " " + p.getLastName());
                        }
    }

    private boolean canSavePerson(Person person) {
        PersonDao personnelDao = new PersonDao();
        List<Person> personList = personnelDao.findAll();

        for (Person p:personList) {
            if (p.getPersonId() == (person.getPersonId()))
                 {
                return false;
            }
        }

        return true;
    }
}
