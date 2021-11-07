package com.learn;

import com.learn.model.Gender;
import com.learn.model.Person;
import com.learn.topics.MappingInStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = getPerson();

        // TODO Sorting in a stream
        personList.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        for (Person pr : personList) {
            //  System.out.println(pr.getName() + "\t" + pr.getAge() + "\t" + pr.getGender());
        }

        /**
         *         TODO filtering
          */
        filterByGender(personList);

        // TODO find all match
        boolean yes = personList.stream()
                .anyMatch(person -> person.getName().equalsIgnoreCase("MR"));
        //  System.out.println(yes);

        // TODO group by

        Map<Gender, List<Person>> genderGroup = personList.stream()
                .collect(Collectors.groupingBy(Person::getGender));
        genderGroup.forEach(
                ((gender, people) -> {
                 //   System.out.println(gender);
                    for (Person person : people) {
                      //  System.out.println(person.getName() + "\t" + person.getAge() + "\t" + person.getGender());
                    }
                    System.out.println();
                }));

        /**
         * TODO Creating streams from regular expressions
         *
         * createStream();
         *
         */



        /**
         * TODO MAP Person BY AGE AND NAME
         *
         *
         * MappingInStream mapping = new MappingInStream();
         *         mapping.mapPersonByAge(personList);
         *
         */





    }

    private static void filterByGender(List<Person> personList) {
        List<Person> femaleList =
                personList.stream()
                        .filter(person -> person.getGender().equals(Gender.MALE))
                        .collect(Collectors.toList());
        for (Person pr : femaleList) {
            // System.out.println(pr.getName() + "\t" + pr.getAge() + "\t" + pr.getGender());
        }
    }

    private static void createStream() {
        Stream<String> stream = Pattern.compile("\\s+").splitAsStream("This is a test");
        stream.forEach(System.out::println);
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
