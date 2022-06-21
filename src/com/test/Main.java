package com.test;

import com.test.entity.Person;
import com.test.entity.Vacation;
import com.test.dao.PersonDao;
import com.test.service.PersonService;
import com.test.service.VacationService;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("\nPlease select Options");
            System.out.println("1. Show all person");
            System.out.println("2. Create person");
            System.out.println("3. Delete person");
            System.out.println("4. Search of persons");

            System.out.println("5. Creat vacation");
            System.out.println("6. Show all vacation");
            System.out.println("7. Change vacation state");
            System.out.println("8. Exit");

            int option = scanner.nextInt();

            if (option == 1) {

                PersonService personService = new PersonService();
                personService.showAll();

            }

            else if (option == 2) {

                System.out.println("enter id : ");
                int id = scanner.nextInt();

                System.out.println("enter name : ");
                String name = scanner.next();

                System.out.println("enter family : ");
                String family = scanner.next();

                Person person = new Person(id,name,family);
                PersonService personService = new PersonService();
                personService.createPerson(person);

            }

            else if (option == 3) {

                System.out.println("enter id : ");
                int id = scanner.nextInt();

                Person person = new Person(id);
                PersonService personService = new PersonService();
                personService.deletePerson(person);

            }

            else if (option == 4){

                System.out.println("\nplease select search option :");
                System.out.println(" 1 : search by id");
                System.out.println(" 2 : search by family");
                int searchOption = scanner.nextInt();

                PersonService personService = new PersonService();

                    if( searchOption == 1 ) {
                        System.out.println(" please enter personId :");
                        int searchId = scanner.nextInt();

                        personService.searchPersonByID(searchId);

                    }
                    else if ( searchOption == 2 ) {
                        System.out.println(" please enter personFamily :");
                        String searchFamily = scanner.next();

                        personService.searchPersonByFamily(searchFamily);
                    }
            }

            else if (option == 5){

                System.out.println("enter id : ");
                int id = scanner.nextInt();

                System.out.println("enter name : ");
                String name = scanner.next();
                System.out.println("enter family : ");
                String family = scanner.next();

                Person person = new Person(id,name,family);

                System.out.println("enter duration : ");
                int duration = scanner.nextInt();



                System.out.println("enter year : ");
                int year = scanner.nextInt();
                System.out.println("enter month : ");
                int month = scanner.nextInt();
                System.out.println("enter day : ");
                int day = scanner.nextInt();

                LocalDate localDate = LocalDate.of(year, month, day);

                Vacation vacation = new Vacation(localDate,duration,person);
                VacationService vacationService = new VacationService();
                vacationService.createVacation(vacation);
                System.out.println("vacation added");

            }
            else if (option == 6){
                VacationService vacationService = new VacationService();
                vacationService.showAllVacation();

            }
            else if (option == 8){

               System.exit(0);
            }

        }while (true);

    }
}
