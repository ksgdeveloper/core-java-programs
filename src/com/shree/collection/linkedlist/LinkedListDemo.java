package com.shree.collection.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Geeks"); 
        ll.add("Geeks"); 
        ll.add(1, "For"); 
        
        System.out.println(ll);
		
	}

}
