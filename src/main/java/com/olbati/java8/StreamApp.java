package com.olbati.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by awahab.
 */
public class StreamApp {
    public static void main(String args[]) {
        // Example 1 operations with string
        List languages = Arrays.asList("Java", "Scala", "C++", "PHP", "Python");
        System.out.println("Languages starts with J :");
        filter(languages, (str) -> ((String) str).startsWith("J"));
        System.out.println("Languages which ends with a ");
        filter(languages, (str) -> ((String) str).endsWith("a"));
        System.out.println("Print all languages :");
        filter(languages, (str) -> true);
        System.out.println("Print no language : ");
        filter(languages, (str) -> false);
        System.out.println("Print language whose length greater than 4:");
        filter(languages, (str) -> ((String) str).length() > 4);

        // and example 2 operations with int
        List costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        costBeforeTax.stream().map((cost) -> (int)cost + .12 * (int) cost).forEach(System.out::println);
    }

    private static void filter(List names, Predicate condition) {
        names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
            System.out.println(name + " ");
        });
    }
}
