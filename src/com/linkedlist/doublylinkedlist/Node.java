package com.linkedlist.doublylinkedlist;

public class Node {
	int data;
	Node nextNode;
	Node previousNode;
	
	Node(int data){
		this.data=data;
	}

	/**
	 * @return the nextNode
	 */
	public Node getNextNode() {
		return nextNode;
	}

	/**
	 * @param nextNode the nextNode to set
	 */
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	/**
	 * @return the previousNode
	 */
	public Node getPreviousNode() {
		return previousNode;
	}

	/**
	 * @param previousNode the previousNode to set
	 */
	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}
	
	
}
