package com.learn.topics;

import com.learn.model.Person;

import java.util.Comparator;
import java.util.List;

public class Sorting {

    public static void sorted(List<Person> people) {

        /**
         * TODO Sort by specific field from a list of objects
         *
         */
        people.stream().sorted(Comparator.comparing(Person::getAge)).forEach(x -> System.out.println(x.getName() + " " + x.getAge()));
    }
}
