package com.shree.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class LocalDateDemo {
    public static void main(String[] args) {
        dateDisplay();
        localDateDisplay();
        getDayfOTheWeek();
        checkLeapYear();
    }

    private static void checkLeapYear() {
        System.out.println("Checking for the leap year");
        System.out.println(LocalDate.now().isLeapYear());
    }

    private static void dateDisplay(){
        System.out.println("Displaying using Date using java.util package *****");
        //java.util.Date new creates current date
        Date theDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(theDate));

        try {
            Date expiryDate = sdf.parse("2022-12-31");
            System.out.println(sdf.format(expiryDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    private static void localDateDisplay(){
        System.out.println("Displaying using LocalDate using java.util package *****");
        //localdate a date in ISO format yyyy MM dd without time
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //tomorrow'ss date
        LocalDate tomorrow = LocalDate.now().plusDays(1l);
        System.out.println(tomorrow);

        //previous day
        LocalDate yesterday = LocalDate.now().minusDays(1l);
        System.out.println(yesterday);

        //previous month same date
        LocalDate previousMonthSameDay = LocalDate.now().minusMonths(1);
        System.out.println(previousMonthSameDay);
        System.out.println(LocalDate.now().minus(1, ChronoUnit.MONTHS));

    }
    private static void getDayfOTheWeek(){
        System.out.println("Displaying using DayOfTheWeek *****");
        DayOfWeek dayOfWeek = LocalDate.parse("2022-11-09").getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}
