package com.shree.datetime;

import java.text.DateFormatSymbols;
import java.util.Arrays;

public class GetListOfMonths {
    public static void main(String[] args) {
        DateFormatSymbols  dateFormatSymbols = new DateFormatSymbols();
        String[] monthNames = dateFormatSymbols.getMonths();
        System.out.println(Arrays.toString(monthNames));

        Arrays.stream(monthNames).forEach(System.out::print);
    }
}
