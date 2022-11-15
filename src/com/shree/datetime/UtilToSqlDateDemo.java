package com.shree.datetime;


public class UtilToSqlDateDemo {

	public static void main(String[] args) {
		//initializing java.util.Date using default constructor
		java.util.Date utilDate = new java.util.Date();
		System.out.println(utilDate);
		
		//initializing sqlDate using constructor as utilDate.getTime() as constructor argument
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		System.out.println(sqlDate);
		
		//initialize values in java
		
	}

}
