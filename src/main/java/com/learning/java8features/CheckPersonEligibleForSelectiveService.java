package com.learning.java8features;

public class CheckPersonEligibleForSelectiveService implements CheckPerson {

    public boolean test(Person person){

        return person.gender == Person.Sex.MALE &&
                person.getAge() >= 31 &&
                person.getAge() <= 37;
    }
}
