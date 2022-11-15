package com.shree.collection;

import java.util.Collection;
import java.util.LinkedList;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection<Integer> list = new LinkedList<>();
		list.add(99);
		list.add(54);
		list.add(112);
		list.add(184);
		list.add(2);
		
		// Output the present list 
        System.out.print("The elements in Collection : ");  
        System.out.println(list); 
        
        System.out.println("Size of list" + list.size());
        System.out.println("If list contains 99 "+list.contains(99));
        list.clear();
        
        System.out.println("Is List empty "+ list.isEmpty());
        
	}

}
