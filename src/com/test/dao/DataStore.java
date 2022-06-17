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
        personList.remove(person);
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
