package com.company;

import java.util.ArrayList;
import java.util.List;

public interface Number {

    private List<Integer>getNumbers()
    {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(-1);
        numbers.add(-2);
        numbers.add(4);
        numbers.add(2);
        return numbers;
    }

    default void printNumber()
    {
        System.out.println("Default method");
        int a = getNumbers().stream()
                .filter(x -> x > 0)
                .findFirst()
                .get();
        System.out.println(a);
    }

}
