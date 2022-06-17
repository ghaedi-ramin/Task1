package com.test.dao;

import com.test.entity.Vacation;

public class VacationDao {

    public void create(Vacation vacation){
        DataStore.AddVacation(vacation);
    }

}
