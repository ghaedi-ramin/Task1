package com.test.service;

import com.test.dao.VacationDao;
import com.test.entity.Vacation;

public class VacationService {

    public void createVacation(Vacation vacation){

        VacationDao vacationDao = new VacationDao();
        vacationDao.create(vacation);
    }

}
