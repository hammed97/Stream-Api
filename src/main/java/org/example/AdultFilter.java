package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class AdultFilter {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 35));
        people.add(new Person("David", 17));

        Predicate<Person> isAdult = person -> person.getAge() >= 18;
        List<Person> adults = people.stream().filter(isAdult).toList();
        adults.forEach(person -> System.out.println(person.getName()));


    }

}
