package com.learn.topics;

import com.learn.model.Person;

import java.util.Comparator;
import java.util.List;

public class Filtering {

    public void filterByAge(List<Person> personList) {
       personList.stream()
               .filter(this::isAdult)
               .sorted(Comparator. comparing(Person::getAge).reversed())
               .forEach( t -> System.out.println(t.getName() + "\t" + t.getAge()));
    }


    public boolean isAdult(Person person) {
        return person.getAge() >= 20;
    }
}
