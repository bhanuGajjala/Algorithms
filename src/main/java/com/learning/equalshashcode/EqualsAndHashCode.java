package com.learning.equalshashcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EqualsAndHashCode {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setEage("30");
        e1.setEid("1");
        e1.setEname("bhanu1");
        Employee e2 = new Employee();
        e2.setEage("30");
        e2.setEid("1");
        e2.setEname("bhanu");
        Employee e3 = new Employee();
        e3.setEage("30");
        e3.setEid("1");
        e3.setEname("bhanu");
        Employee e4 = new Employee();
        e4.setEage("30");
        e4.setEid("1");
        e4.setEname("bhanu");
        Employee e5 = new Employee();
        e5.setEage("30");
        e5.setEid("1");
        e5.setEname("bhanu");
        Employee e6 = new Employee();
        e6.setEage("30");
        e6.setEid("1");
        e6.setEname("bhanu");
        Employee e7 = new Employee();
        e7.setEage("30");
        e7.setEid("1");
        e7.setEname("bhanu");


        List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5,e6,e7);

        System.out.println("Before : " + list);

        Set set = new HashSet(list);

        System.out.println("After : " + set);





    }
}
