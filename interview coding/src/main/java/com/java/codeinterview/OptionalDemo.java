package com.java.codeinterview;

import java.util.Arrays;
import java.util.List;

public class OptionalDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ram", "Shyam", "Rahul");
        String string = list.stream()
                .filter(name -> name.equalsIgnoreCase("Rahl"))
                .findAny()
                .orElse(null);
        if(string == null) {
            System.out.println("nothing");
        }
        System.out.println(string);
    }
}
