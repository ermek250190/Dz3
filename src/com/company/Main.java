package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double [] massiv = new double[]{4.6, 1.5, 6.4, -5.6, 3.4,2.34, -3.5, 1.22, 8.4, -5, 3.4, 44.87,55.4, -66.4, 5.65};
        double sum = 0;
        for (double sredOrifmetika : massiv) {
            sum += sredOrifmetika;
        }
        System.out.println("sum/massiv.length = " + sum/massiv.length);

        System.out.println("_________________________________________________________________  \n\n");

        Arrays.sort(massiv);
        for (double values : massiv) {
            System.out.print( values + ",   ");
            
        }

    }
}