package com.shree.datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("EEE dd-MM-yyyy h:mm a ww");
		System.out.println(sdf.format(date));

		//Java 8 Date and time examples
		LocalDate localdate = LocalDate.now();
		System.out.println(localdate.toString());
		System.out.println(localdate.getDayOfMonth());
		System.out.println(localdate.getMonthValue());
		System.out.println(localdate.getYear());
		System.out.println(localdate.isLeapYear());
		System.out.println(localdate.plusDays(30));
		System.out.println(localdate.minusDays(30));
		
		//LocalTime
		LocalTime localTime = LocalTime.now();  
		System.out.println(localTime);
		System.out.println(localTime.toString());    //12:20
		System.out.println(localTime.getHour());     //12
		System.out.println(localTime.getMinute());   //20
		System.out.println(localTime.getSecond());   //0
		System.out.println(localTime.MIDNIGHT);      //00:00
		System.out.println(localTime.NOON);          //12:00
		
		//LocalDateTime
		LocalDateTime localDateTime = LocalDateTime.now(); 
		System.out.println(localDateTime.toString());      //2013-05-15T10:01:14.911
		System.out.println(localDateTime.getDayOfMonth()); //15
		System.out.println(localDateTime.getHour());       //10
		System.out.println(localDateTime.getNano());       //911000000
		
		LocalDate endofCentury = LocalDate.of(2022, 2, 18);
		LocalDate now = LocalDate.now();
		Period diff = Period.between(endofCentury, now);
		System.out.printf("Difference is %d years, %d months and %d days old", 
		                    diff.getYears(), diff.getMonths(), diff.getDays());
		
		
	}
}
