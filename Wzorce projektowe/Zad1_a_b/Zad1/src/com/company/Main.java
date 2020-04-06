package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here



        Pizza pizza=new Pizza.Builder()
                        .id(1)
                        .dodatki(new String[]{"szynka","pieczarki","cebula","papryka","kielbasa","ser"})
                        .sos("pomidorowy")
                        .rozmiar("mala")
                        .umieszczenieSosu("wewnatrz").build();


            System.out.println(pizza.getId());
            System.out.println(pizza.getSos());
            System.out.println(pizza.getRozmiar());
            System.out.println(pizza.getUmieszczenieSosu());
            System.out.println(Arrays.toString(pizza.getDodatki()));


    }
}
