package com.linkedlist.singlelinkedlist;

public class Node {
	private int data;
	Node node;
	
	Node(int data){
		this.data=data;
	}

	/**
	 * @return the node
	 */
	public Node getNext() {
		return node;
	}

	/**
	 * @param node the node to set
	 */
	public void setNext(Node node) {
		this.node = node;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	
	
}
