package com.test.dao;

import com.test.entity.Person;
import com.test.entity.Vacation;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

    private static  List<Person> personList = new ArrayList<>();
    private static List<Vacation> vacationList = new ArrayList<>();


    public static void AddPerson(Person person){
        personList.add(person);
    }

    public static void deletePerson(Person person){

        for (int i = 0; i <personList.size() ; i++) {

            if (personList.get(i).getName().equals(person.getName()) &&
                    personList.get(i).getLastName().equals(person.getLastName())){
                personList.remove(i);
            }
        }
    }

    public static List<Person> findAll(){
        return personList;
    }

    public static void AddVacation(Vacation vacation){
        vacationList.add(vacation);
    }
    public static List<Vacation> findAll_Vacation(){
        return vacationList;
    }
}
