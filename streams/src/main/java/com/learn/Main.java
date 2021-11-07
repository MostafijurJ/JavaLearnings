package com.learn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = getPerson();

        // TODO Sorting in a stream
        personList.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        for (Person pr : personList) {
            //  System.out.println(pr.getName() + "\t" + pr.getAge() + "\t" + pr.getGender());
        }

        // TODO filtering
        List<Person> femaleList =
                personList.stream()
                        .filter(person -> person.getGender().equals(Gender.MALE))
                        .collect(Collectors.toList());
        for (Person pr : femaleList) {
            // System.out.println(pr.getName() + "\t" + pr.getAge() + "\t" + pr.getGender());
        }

        // TODO find all match
        boolean yes = personList.stream()
                .anyMatch(person -> person.getName().equalsIgnoreCase("MR"));
        //  System.out.println(yes);

        // TODO group by

        Map<Gender, List<Person>> genderGroup = personList.stream()
                .collect(Collectors.groupingBy(Person::getGender));
        genderGroup.forEach(
                ((gender, people) -> {
                    System.out.println(gender);
                    for (Person person : people) {
                        System.out.println(person.getName() + "\t" + person.getAge() + "\t" + person.getGender());
                    }
                    System.out.println();
                }));

        // TODO

    }

    private static List<Person> getPerson() {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("KAJOL", "25", Gender.MALE));
        personList.add(new Person("Mr", "16", Gender.MALE));
        personList.add(new Person("Jerry", "20", Gender.FEMALE));
        personList.add(new Person("Alice", "21", Gender.COMMON));
        return personList;
    }
}
