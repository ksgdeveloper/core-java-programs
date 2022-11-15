package com.shree.collection.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsCopyDemo {
	public static void main(String[] args) {
		// create source list
        List<String> source_List = new ArrayList<>();
        source_List.add("Lion");
        source_List.add("Monkey");
        source_List.add("Kangaroo");
        
        List<String> destination_List = new ArrayList<>();
        // destination list
        destination_List.add("Shoes");
        destination_List.add("Toys");
        destination_List.add("Horse");
        destination_List.add("Tiger");
        
        //destination size should be either equal or greater than the source or it throw exception
        //it generally overwrites the n number of items if the destiny list
        Collections.copy(destination_List, source_List);
        
        System.out.println(destination_List);
	
	}
}
