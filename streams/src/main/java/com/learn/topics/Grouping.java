package com.learn.topics;

import com.learn.model.Gender;
import com.learn.model.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {

  public static void groupedByGender(List<Person> personList) {
    Map<Gender, List<Person>> genderGroup =
        personList.stream().collect(Collectors.groupingBy(Person::getGender));
    genderGroup.forEach(
        ((gender, people) -> {
          System.out.println(gender);
          for (Person person : people) {
            System.out.println(
                person.getName() + "\t" + person.getAge() + "\t" + person.getGender());
          }
          System.out.println();
        }));
  }
}
