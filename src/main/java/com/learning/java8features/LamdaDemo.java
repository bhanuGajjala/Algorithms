package com.learning.java8features;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class LamdaDemo {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(new Person("Bhanu", LocalDate.of(1984, 06, 13), Person.Sex.MALE, "bhanu@gmail.com"),
                new Person("Vidhya", LocalDate.of(1987, 05, 31), Person.Sex.FEMALE, "vidya@gmail.com"));


        //printPersonOlderThan(personList, 39);
        //printPersonWithinAgeRange(personList, 32, 35);

       // printPersonWithCheckPerson(personList, new CheckPersonEligibleForSelectiveService());
        printPersonWithCheckPerson(personList, new CheckPerson() {
            @Override
            public boolean test(Person person) {
                return person.gender == Person.Sex.MALE &&
                        person.getAge() >= 31 &&
                        person.getAge() <= 37;
            }
        });


    }

    public static void printPersonWithCheckPerson(List<Person> personList, CheckPerson conditions){
        personList.stream().filter(p -> conditions.test(p)).forEach(Person::printPerson);
    }

    public static void printPersonOlderThan(List<Person> personList, int age){

        personList.stream().filter(p -> p.getAge() >= age).forEach(Person::printPerson);
        /*for(Person person : personList){
            if(person.getAge() >= age){
                person.printPerson();
            }
        }*/
    }

    public static void printPersonWithinAgeRange(List<Person> personList, int low, int high){
        personList.stream().filter(p -> low <= p.getAge()  && high < p.getAge()).forEach(Person::printPerson);
        /*for(Person person : personList){
            if(low <= person.getAge()  && high < person.getAge()){
                person.printPerson();
            }
        }*/
    }
}

class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress){
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public int getAge(){
        return LocalDate.now().getYear() - birthday.getYear();
    }

    public void printPerson(){
        System.out.println("Name: " + name);
    }
}
