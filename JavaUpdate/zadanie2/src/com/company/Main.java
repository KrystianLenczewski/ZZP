package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        var numbers=new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(-1);
        numbers.add(26);
        numbers.add(33);
        List<Integer> copyList = List.copyOf(numbers);

        copyList.stream().filter(x->x>0).forEach(s-> System.out.println(s));

        //copyList.add(55);//error

        



    }
}
