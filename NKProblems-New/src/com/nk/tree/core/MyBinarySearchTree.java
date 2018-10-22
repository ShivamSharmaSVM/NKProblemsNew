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
	
	public static MyBinarySearchTree getComplexBinarySearchTree()
	{
		MyBinarySearchTree tree = new MyBinarySearchTree();
		Node root = tree.getRoot();
		
		/*
		 * Creating a Complex Binary Search tree
		 *                  (5)
		 *                /    \
		 *             (3)      (8)
		 *             / \     /   \
		 *          (1)  (4) (6)    (12)
		 *           \        \     /  \ 
		 *           (2)	  (7)  (10) (13)
		 *           			   /  \
		 *                       (9) (11) 
		 */
		
		root = new Node(5);
		root.setLeftNode(3);
		root.setRightNode(8);
		
		root.getLeftNode().setLeftNode(1);
		root.getLeftNode().setRightNode(4);
		root.getLeftNode().getLeftNode().setRightNode(2);
		
		root.getRightNode().setLeftNode(6);
		root.getRightNode().setRightNode(12);
		root.getRightNode().getLeftNode().setRightNode(7);
		
		root.getRightNode().getRightNode().setLeftNode(10);
		root.getRightNode().getRightNode().setRightNode(13);
		
		root.getRightNode().getRightNode().getLeftNode().setLeftNode(9);
		root.getRightNode().getRightNode().getLeftNode().setRightNode(11);
		
		tree.setRoot(root);
		
		return tree;
	}
	
	public Node find(Node n, int data)
	{
		int temp = n.getValue(); 
		if(temp==data)
			return n;
		
		if(temp>data)
		{
			if(n.hasLeftNode())
				return find(n.getLeftNode(), data);
			else
				return null;
		}
		else
		{
			if(n.hasRightNode())
				return find(n.getRightNode(), data);
			else
				return null;
		}
	}
}
