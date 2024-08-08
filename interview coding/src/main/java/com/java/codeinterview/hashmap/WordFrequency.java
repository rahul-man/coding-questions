package com.java.codeinterview.hashmap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {

    public static void main(String[] args) {

        String string = "Java is a programming language. Java is versatile";

       /* Arrays.stream(string.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);*/

        //Print the word which has occurred more than 1

        Map.Entry<String, Long> stringLongEntry = Arrays.stream(string.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparing(value -> value.getValue() > 1))
                .get();
        System.out.println(stringLongEntry);

        countFreequency(string);


    }

    private static void countFreequency(String string) {
        String[] words = string.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        map.forEach((k, v) -> {
          //  if (map.get(k) > 1) {
                System.out.println("Key: " + k + "->" + "Value: " + v);
         //   }
        });
    }
}
