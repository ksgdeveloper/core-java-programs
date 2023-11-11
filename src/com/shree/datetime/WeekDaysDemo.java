package com.shree.datetime;

import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.util.Arrays;

public class WeekDaysDemo {
    public static void main(String[] args) {
        String[] weekdays = new DateFormatSymbols().getWeekdays();
        //shows 8 as length of weekdays
        System.out.println(weekdays);
        for(String day : weekdays){
            System.out.print(day+",");
        }
        Arrays.asList(weekdays).stream().filter(d -> d.length()>0).map(day -> day.toLowerCase()).forEach(System.out::println);

        System.out.println("Today : " + LocalDate.now().getDayOfWeek().toString().toLowerCase());
    }
}
