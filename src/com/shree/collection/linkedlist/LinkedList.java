package com.shree.collection.linkedlist;

public class LinkedList {
	Node head;
	
	public void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		/* Three nodes have been allocated dynamically.
        We have references to these three blocks as head, 
        second and third

        llist.head        second              third
           |                |                  |
           |                |                  |
       +----+------+     +----+------+     +----+------+
       | 1  | null |     | 2  | null |     |  3 | null |
       +----+------+     +----+------+     +----+------+ */
		
		/*  Now next of the first Node refers to the second.  So they
        both are linked.

	     llist.head        second              third
	        |                |                  |
	        |                |                  |
	    +----+------+     +----+------+     +----+------+
	    | 1  |  o-------->| 2  | null |     |  3 | null |
	    +----+------+     +----+------+     +----+------+ */

    
		llist.head.next = second;
		
	    
	    // Link second node with the third node

	    /*  Now next of the second Node refers to third.  So all three
	        nodes are linked.

	     llist.head        second              third
	        |                |                  |
	        |                |                  |
	    +----+------+     +----+------+     +----+------+
	    | 1  |  o-------->| 2  |  o-------->|  3 | null |
	    +----+------+     +----+------+     +----+------+ */
		
		second.next = third; 	
		
		//printing the linked list values
		llist.printList();
	}
}
