package com.ironion.filter;

import java.util.List;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * @author ironion
 * @date 2022/6/14 19:23
 */
public class CriteriaPatternDemo {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        FemaleCriteria femaleCriteria = new FemaleCriteria();
        MaleCriteria maleCriteria = new MaleCriteria();
        SingleCriteria singleCriteria = new SingleCriteria();
        AndCriteria singleMale = new AndCriteria(singleCriteria, maleCriteria);
        OrCriteria singleOrFemale = new OrCriteria(singleCriteria, femaleCriteria);
        System.out.println("male: " + maleCriteria.meetCriteria(persons)
                .stream().map(Person::getName).collect(Collectors.joining(",","[","]")));
        System.out.println("female: " + femaleCriteria.meetCriteria(persons)
                .stream().map(Person::getName).collect(Collectors.joining(",","[","]")));
        System.out.println("single: " + singleCriteria.meetCriteria(persons)
                .stream().map(Person::getName).collect(Collectors.joining(",","[","]")));
        System.out.println("singleMale: " + singleMale.meetCriteria(persons)
                .stream().map(Person::getName).collect(Collectors.joining(",","[","]")));
        System.out.println("singleOrFemale: " + singleOrFemale.meetCriteria(persons)
                .stream().map(Person::getName).collect(Collectors.joining(",","[","]")));
    }
}
