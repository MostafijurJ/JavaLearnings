package com.learn;

import com.learn.model.Gender;
import com.learn.model.Person;
import com.learn.topics.Filtering;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = getPerson();

    /**
     * TODO find any match
     *
     * <p>findAnyMatch(personList);
     */

    /**
     * TODO group by
     *
     * <p>Grouping.groupedByGender(personList);
     */

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


    /**
     * TODO Filter and Sorted by age in ascending order
     *
     * <p>Filtering filtering = new Filtering();
     * filtering.filterByAge(personList);
     */
  }

  private static void findAnyMatch(List<Person> personList) {
    boolean yes = personList.stream().anyMatch(person -> person.getName().equalsIgnoreCase("MR"));
    System.out.println(yes);
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
        personList.add(new Person("KAJOL", 25, Gender.MALE));
        personList.add(new Person("Mr", 16, Gender.MALE));
        personList.add(new Person("Jerry", 20, Gender.FEMALE));
        personList.add(new Person("Alice", 21, Gender.COMMON));
        return personList;
    }
}
