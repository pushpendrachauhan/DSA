package com.linkedlist.singlelinkedlist;

public class LinkedList {
	private Node head;
	
	LinkedList(){
		head=null;
	}
	
	void addToFirst(int data){
		Node node=new Node(data);
		if(head==null){
			head=node;
		}else{
			node.setNext(head);
			head=node;
		}	
	}
	
	void traverseList(){
		Node temp=head;
		if (temp != null){
			while(temp != null){
				System.out.print(temp.getData()+" ");
				temp=temp.getNext();
			}
		}
	}
	
	public int getLength(){
		int length=0;
		Node temp=head;
		if (temp !=null){
			while(temp!=null){
				length=length+1;
				temp=temp.getNext();
			}
		}
		return length;
	}
	
	/*
	 * its same like void add()
	 */
	void addToLast(int data){
		Node node = new Node(data);
		if(head == null){
			head=node;
		}else{
			Node temp=head;
			while(temp.getNext() !=null){
				temp=temp.getNext();
			}
			temp.setNext(node);
		}
		
	}
	
	void addToSpecificPosition(int data,int position){
		Node node = new Node(data);
		int length=this.getLength();
		if (head ==  null && position >0 ){
			System.out.println("error");
		}else if(position>length+2){
			System.out.println("wrong position");
		}else{
			if(position==0){
				node.setNext(head);
				head=node;
			}
			Node previousNode=head;
			int count=1;
			while(count<position-1){
				previousNode=previousNode.getNext();
				count=count+1;
			}
			Node nextNode=previousNode.getNext();
			previousNode.setNext(node);
			node.setNext(nextNode);
			
			
		}
		
	}
	
	
}
