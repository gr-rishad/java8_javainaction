package com.example.demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(
                new Dish("Pork", false, 800, Dish.Type.OTHER),
                new Dish("Beef", false, 700, Dish.Type.MEAT),
                new Dish("cc", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );

        // get dish name from object
        List<String> dishNames = menu.stream().map(Dish::getName).collect(Collectors.toList());
        // System.out.println(dishNames);

        // dish names length
        List<Integer> dishNamesLength = menu.stream().map(Dish::getName).map(String::length).collect(Collectors.toList());
        // System.out.println(dishNamesLength);

        // length of each string
        List<String> words = Arrays.asList("Java8", "Lambdas");
        System.out.println("LIST " + words);
        List<String> uniqueCharacters =
                words.stream()
                        .map(word -> word.split(""))
                        .flatMap(Arrays::stream)
                        .collect(Collectors.toList());
        System.out.println(uniqueCharacters);
        //words.stream().map(String::length).forEach(System.out::println);

    }
}
