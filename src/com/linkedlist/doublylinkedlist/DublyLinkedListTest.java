package com.linkedlist.doublylinkedlist;

public class DublyLinkedListTest {
public static void main(String[] args) {
	DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
/*	doublyLinkedList.addToFirst(1);
	doublyLinkedList.traverseForward();
	System.out.println();
	doublyLinkedList.addToFirst(2);
	doublyLinkedList.traverseForward();
	System.out.println();
	doublyLinkedList.addToFirst(3);
	doublyLinkedList.traverseForward();*/
	
	
	doublyLinkedList.addToLast(1);
	doublyLinkedList.traverseForward();
	System.out.println();
	doublyLinkedList.addToLast(2);
	doublyLinkedList.traverseForward();
	System.out.println();
	doublyLinkedList.addToLast(3);
	doublyLinkedList.traverseForward();
}
}
