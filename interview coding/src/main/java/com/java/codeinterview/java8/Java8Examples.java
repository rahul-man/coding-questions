package com.java.codeinterview.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream; 

public class Java8Examples {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(123, 45, 167, 189, 12, 1234, 198, 102);

        List<String> fruits = Arrays.asList("Mango", "Apple", "Banana", "Kiwi");

        //1. Count the total number of vowels in a collection of strings.
        long count = fruits.stream()
                .flatMap(t -> Stream.of(t.toLowerCase().split("")))
                .filter("aeiou"::contains)
                .count();
        System.out.println(count);

        //2. Given a list of integers, find out all the numbers starting with 1.

        List<Integer> collect = numbers.stream()
                .filter(n -> String.valueOf(n).startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(collect);

        //3. Given a list of integers, sort all the values present in it in descending order.
        List<Integer> sortedList = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList);

        //4. Given a list of strings, sort them according to increasing order of their length.
        List<String> stringList = fruits.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println(stringList);

        //5.Given two lists of strings, merge them and remove duplicates.
        List<String> list1 = Arrays.asList("apple", "banana", "orange");
        List<String> list2 = Arrays.asList("banana", "grape", "kiwi");

        List<String> mergedList = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
        System.out.println(mergedList);

        //6. find the sum of all the numbers in the integer
        int num = 12345;
        int reduce = String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .reduce(0, Integer::sum);
        System.out.println(reduce);


    }
}
