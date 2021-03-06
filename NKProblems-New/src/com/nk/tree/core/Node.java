package com.nk.tree.core;

public class Node implements Comparable<Node>
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
	
	public void setLeftNode(Node node)
	{
		this.leftNode = node;
	}
	
	public void setRightNode(Node node)
	{
		this.rightNode = node;
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
	
	@Override
	public boolean equals(Object node2)
	{
		return this.data==((Node) node2).getValue();
	}

	public boolean isGreator(Node node)
	{
		return this.data > node.getValue();
	}
	
	public boolean isSmaller(Node node)
	{
		return this.data < node.getValue();
	}
	
	@Override
	public int compareTo(Node node)
	{
		if(this.data == node.getValue())
			return 0;
		
		if(this.data > node.getValue())
			return 1;
		
		return -1;
	}
	
	public void setValue(int data)
	{
		this.data = data;
	}
	
}
