package com.test.dao;

import com.test.entity.Person;
import com.test.entity.Vacation;

import java.util.List;

public class VacationDao {

    public void create(Vacation vacation){
        DataStore.AddVacation(vacation);
    }
    public List<Vacation> findAll() {
        return DataStore.findAllVacation();
    }

}
