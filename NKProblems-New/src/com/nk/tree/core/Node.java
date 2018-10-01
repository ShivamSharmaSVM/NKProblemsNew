package com.nk.tree.core;

public class Node
{
	int data;
	Node leftNode;
	Node rightNode;
	
	public Node(int data)
	{
		this.data = data;
		leftNode = null;
		rightNode = null;
	}
	
	public void setLeftNode(int data)
	{
		this.leftNode = new Node(data);
	}
	
	public void setRightNode(int data)
	{
		this.rightNode = new Node(data);
	}
	
	public Node getLeftNode()
	{
		return leftNode;
	}
	
	public Node getRightNode()
	{
		return rightNode;
	}
	
	@Override
	public String toString()
	{
		return data+"";
	}
	
	public boolean isExternal()
	{
		return (leftNode==null && rightNode==null);
	}
	
	public int getValue()
	{
		return data;
	}
	
	public void setRoot(int value)
	{
		 this.data = value;
	}
	
	public boolean hasLeftNode()
	{
		return this.leftNode!=null;
	}
	public boolean hasRightNode()
	{
		return this.rightNode!=null;
	}
	
	public boolean isEqual(Node node2)
	{
		return this.data==node2.getValue();
	}
}
