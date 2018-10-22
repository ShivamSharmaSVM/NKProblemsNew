package com.nk.tree.core;

public class MyBinarySearchTree
{
	Node root;
	
	public MyBinarySearchTree()
	{
		root = null;
	}
	
	public MyBinarySearchTree(Node root)
	{
		this.root = root;
	}

	public Node getRoot()
	{
		return root;
	}

	public void setRoot(Node root)
	{
		this.root = root;
	}
	
	public static MyBinarySearchTree getSimpleBinarySearchTree()
	{
		MyBinarySearchTree tree = new MyBinarySearchTree();
		Node root = tree.getRoot();
		
		/*
		 * Creating a Simple Binary tree
		 *                 (4)
		 *                /   \
		 *             (2)     (6)
		 *             / \     / \
		 *          (1)  (3) (5) (7)
		 */
		
		root = new Node(4);
		root.setLeftNode(2);
		root.setRightNode(6);
		
		root.getLeftNode().setLeftNode(1);
		root.getLeftNode().setRightNode(3);
		
		root.getRightNode().setLeftNode(5);
		root.getRightNode().setRightNode(7);
		
		tree.setRoot(root);
		
		return tree;
	}
	
	public void inoderTraversal()
	{
		getInorderTraversal(root);
		return;
	}
	
	public void getInorderTraversal(Node n)
	{
		if(root==null)
			return ;
		
		if(n.hasLeftNode())
			getInorderTraversal(n.getLeftNode());
		
		System.out.print(n+" ");
		
		if(n.hasRightNode())
			getInorderTraversal(n.getRightNode());
	}
}
