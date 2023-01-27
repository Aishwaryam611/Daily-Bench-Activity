package com.collection;

import java.util.LinkedList;

public class AddElementInLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		// Adding elements at the end of the list

		list.add(1);

		list.add(2);

		list.add(3);

		list.add(4);

	

		System.out.println("Printing the elements of list: "+list);

		// Adding an element at index 2

		list.add(2, 111);

	

		System.out.println("Adding an element at index 2 : "+list);

		// LinkedList with elements to add

		LinkedList<Integer> list1 = new LinkedList<Integer>();

		// Adding elements at the beginning of the list1

		list1.addFirst(100);

		list1.addFirst(200);

		list1.addFirst(300);

		// Printing the elements of list1

		System.out.println(	 "Printing the elements of list1:"+list1);

		// Adding all elements of list1 at index 3 of list

		list.addAll(3, list1);

		// Printing the elements of list

		System.out.println("Printing the elements of list: "
				+list);
	}
}
