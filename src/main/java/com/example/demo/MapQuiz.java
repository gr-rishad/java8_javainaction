package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapQuiz {

    public static void main(String[] args) {

        // 1. example -> [1,2,3,4,5] return [1,4,9,16,25]
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squareList = list.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(squareList);

        // 2. list [1,2,3] and a list [3,4] return [(1,3),(1,4),(2,3),(2,4),(3,3),(3,4)]
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        List<int[]> pairs =
                numbers1.stream()
                        .flatMap(i -> numbers2.stream()
                                .filter(j -> (i + j) % 3 == 0)
                                .map(j -> new int[]{i, j}))
                        .collect(Collectors.toList());
        System.out.println(pairs);
    }
}
