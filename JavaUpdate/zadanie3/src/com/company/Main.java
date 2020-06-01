package com.company;

import java.io.IOException;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        System.out.println( "  ".isBlank() );//true
        System.out.println( "abc ".isBlank() );//false
        String str = "AB\nAB\nAB";

        Stream<String> lines = str.lines();
        lines.forEach(System.out::println);
        //AB
        //AB
        //AB

        System.out.println("  DB  ".strip());//DB
        System.out.println("  DB  ".stripLeading());//DB
        System.out.println("  DB  ".stripTrailing());//   DB
        System.out.println("==".repeat(5));//==========

    }
}
