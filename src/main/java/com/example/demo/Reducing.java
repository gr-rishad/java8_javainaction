package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        // summing the element
        List<Integer> numbers = Arrays.asList(10, 24, 43, 21);
        //int sum = numbers.stream().reduce(0, (a, b) -> (a + b));
        int sum = numbers.stream().reduce(0, (Integer::sum));
        System.out.println("Total Result  = " + sum);

        // returning the max
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        System.out.println("Max number is :" + max.get());


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

        // int count = menu.stream().map(d -> 1).reduce(0, (a, b) -> (a + b));
        long count = menu.stream().count();
        System.out.println("Count = " + count);
    }
}
