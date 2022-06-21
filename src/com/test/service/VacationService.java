package com.test.service;

import com.test.dao.PersonDao;
import com.test.dao.VacationDao;
import com.test.entity.Person;
import com.test.entity.Vacation;

public class VacationService {

    public void createVacation(Vacation vacation){

        VacationDao vacationDao = new VacationDao();
        vacationDao.create(vacation);
    }

    public void showAllVacation(){


        VacationDao vacationDao = new VacationDao();
        for (Vacation v : vacationDao.findAll()) {
            System.out.println(v.getDate() + " " +v.getDuration() + " " + v.getPerson().getPersonId() + " "+ v.getPerson().getName() + " " + v.getPerson().getLastName());
        }
    }


}
