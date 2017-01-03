package com.linkedlist.singlelinkedlist;

public class LinkedListTest {
public static void main(String[] args) {
	LinkedList linkedList=new LinkedList();
/*	linkedList.addToFirst(1);
	linkedList.addToFirst(2);
	linkedList.addToFirst(3);
	linkedList.addToFirst(4);*/
	
	
/*	linkedList.addToLast(2);
	linkedList.addToLast(5);
	linkedList.addToLast(7);*/
	
	
	// add to specific position
	linkedList.addToLast(1);
	linkedList.addToLast(2);
	linkedList.addToLast(3);
	linkedList.addToLast(4);
	linkedList.addToLast(5);
	
	
	linkedList.traverseList();
	
	
	System.out.println();
	
	linkedList.addToSpecificPosition(22, 4);
	linkedList.traverseList();
	
	
	
/*	System.out.println("length is ************");
	System.out.println(linkedList.getLength());*/
}
}
