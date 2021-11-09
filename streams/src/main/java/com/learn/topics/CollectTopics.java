package com.learn.topics;

import com.learn.model.Person;

import java.util.List;
import java.util.stream.Collectors;

public class CollectTopics {

    public static void collect(List<Person> persons) {

        persons.stream()
                .collect(Collectors.groupingBy(Person::getGender))
                .forEach((k, v) -> {
                    v.stream().forEach(x-> System.out.println(x.getName()));
                });

    }

}
