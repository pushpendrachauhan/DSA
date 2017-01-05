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
	
	int getLength(){
		int length=0;
		Node temp=head;
		if (temp !=null){
			while(temp!=null){
				length=length+1;
				temp=temp.getNextNode();
			}
		}
		return length;
	}
	
	
	
	void addToSpecificPosition(int data,int position){
		int length=this.getLength();
		if(position>length+1){
			System.out.println("invalid position");
		}else if (position==0){
			this.addToFirst(data);
		}else{
			Node temp=head;
			Node node = new Node(data);
			int count=1;
			while(count<position-1){
				temp=temp.getNextNode();
				count=count+1;
			}
			Node tempNextNode=temp.getNextNode();
			temp.setNextNode(node);
			node.setPreviousNode(temp);
			if(tempNextNode != null ){
				// i forgot this case
				tempNextNode.setPreviousNode(node);
			}
			
			node.setNextNode(tempNextNode);
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
