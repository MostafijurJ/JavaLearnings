package com.learn.topics;

import com.learn.model.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Sorting {

  public static void sorted(List<Person> people) {

    /**
     * TODO Sort by specific field from a list of objects
     *
     * <p>TODO checking if the list is null or empty
     */
    people.stream()
        .sorted(Comparator.nullsFirst(Comparator.comparing(Person::getAge)))
        .filter(Objects::nonNull)
        .forEach(x -> System.out.println(x.getName() + " " + x.getAge()));

    people.stream()
        .sorted(Comparator.comparing(Person::getAge))
        .forEach(x -> System.out.println(x.getName() + " " + x.getAge()));
  }
}
