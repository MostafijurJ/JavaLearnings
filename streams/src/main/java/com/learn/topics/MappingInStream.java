package com.learn.topics;

import com.learn.model.Gender;
import com.learn.model.Person;

import java.util.List;

public class MappingInStream {

    public void mapPersonByAge(List<Person> personList) {
        personList.stream()
                .map(t -> {
                    System.out.println("IN MAP: " + (t.getGender().toString().equalsIgnoreCase(Gender.MALE.name()) ? t.getGender() : t.getName()));
                    return t.getAge();
                })
                .forEach(System.out::println);
    }
}
