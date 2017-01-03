package com.linkedlist.doublylinkedlist;

public class DoublyLinkedList {
	Node head;
	DoublyLinkedList(){
		head=null;
	}
	
	void addToFirst(int data){
		Node node=new Node(data);
		if(head==null){
			head=node;
		}else{
			node.setNextNode(head);
			head.setPreviousNode(node);
			head=node;
		}
	}
	
	void addToLast(int data){
		Node node = new Node(data);
		if(head == null ){
			head=node;
		}else{
			Node temp=head;
			while(temp.getNextNode()!=null){
				temp=temp.getNextNode();
			}
			temp.setNextNode(node);
			node.setPreviousNode(temp);
		}
	}
	
	
	void traverseForward(){
		if(head != null){
			Node temp=head;
			while(temp !=null){
				System.out.print(temp.data+" ");
				temp=temp.getNextNode();
			}
		}
	}
	
	
}
