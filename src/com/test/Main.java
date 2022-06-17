package com.test;


import com.test.entity.Person;
import com.test.entity.Vacation;
import com.test.dao.PersonnelDao;
import com.test.service.PersonService;
import com.test.service.VacationService;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Please select Options");
            System.out.println("1. Create person");
            System.out.println("2. Create vacation");
            System.out.println("3. delete person");
            System.out.println("4. show all person");
            System.out.println("5. Exit");
            int a = scanner.nextInt();
            if (a == 1) {

                System.out.println("enter name : ");
                String name = scanner.next();

                System.out.println("enter family : ");
                String family = scanner.next();

                Person person = new Person(name,family);
                PersonService personService = new PersonService();
                personService.createPerson(person);

            }else if (a == 2){

                System.out.println("enter name : ");
                String name = scanner.next();
                System.out.println("enter family : ");
                String family = scanner.next();
                System.out.println("enter duration : ");
                int duration = scanner.nextInt();

                Person person = new Person(name,family);

                System.out.println("enter year : ");
                int year = scanner.nextInt();
                System.out.println("enter month : ");
                int month = scanner.nextInt();
                System.out.println("enter day : ");
                int day = scanner.nextInt();

                LocalDate localdate = LocalDate.of(year, month, day);

                Vacation vacation = new Vacation(localdate,duration,person);

                VacationService vacationService = new VacationService();
                vacationService.createVacation(vacation);
                System.out.println("vacation added");


            }else if (a == 3){

                System.out.println("enter name: ");
                String name = scanner.next();

                System.out.println("enter family : ");
                String family = scanner.next();

                Person person = new Person(name,family);
                PersonService personService = new PersonService();
                personService.deletePerson(person);

            } else if (a == 4) {
                PersonnelDao personnelDao = new PersonnelDao();
                for (Person p : personnelDao.findAll()) {
                    System.out.println(p.getName() + " " + p.getLastName());
                }

            } else if (a == 5){

                break;
            }

        }while (true);

    }
}
