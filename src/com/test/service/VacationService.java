package com.test.service;

import com.test.dao.PersonDao;
import com.test.dao.VacationDao;
import com.test.entity.Vacation;

import java.util.*;

public class VacationService {

    public void createVacation(Vacation vacation ) {

        PersonDao personDao = new PersonDao();
        Iterator iterator = personDao.findAll().iterator();
        if (iterator.hasNext()) {
            VacationDao vacationDao = new VacationDao();
            vacationDao.create(vacation);

        }
        else
            System.out.println("no person to request vacation");
    }
    public void showAllVacation(){

        VacationDao vacationDao = new VacationDao();
        for (Vacation v : vacationDao.findAll()) {
            System.out.println(v.getDate() + " " +v.getDuration() + " " + v.getPerson().getPersonId() + " "+ v.getPerson().getName() + " " + v.getPerson().getLastName() + " " + v.getState());
        }
    }

    public void confirmVacationState(int record){
        VacationDao vacationDao = new VacationDao();
        for (Vacation v : vacationDao.findAll()){
           v = vacationDao.findAll().get(record);

            v.setState(Vacation.VacationState.CONFIRMED);
        }
    }


    public void unConfirmVacationState(int record){
        VacationDao vacationDao = new VacationDao();
        for (Vacation v : vacationDao.findAll()){
            v = vacationDao.findAll().get(record);

            v.setState(Vacation.VacationState.UNCONFIRMED);
        }
    }

}