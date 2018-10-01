package com.nk.tree.core;

public class MyBinaryTree
{
	Node root;
	
	public MyBinaryTree()
	{
		root = null;
	}
	
	public Node getRoot()
	{
		return root;
	}
	
	public void setRoot(Node root)
	{
		 this.root = root;
	}
	
	public void preOrderTraversalRecur()
	{
		Node tempRoot = root;
		getPreOrderTraversalRecur(tempRoot);
	}
	
	public void getPreOrderTraversalRecur(Node tempRoot)
	{
		if(tempRoot == null)
			return;
		
		System.out.print(tempRoot);
		getPreOrderTraversalRecur(tempRoot.leftNode);
		getPreOrderTraversalRecur(tempRoot.rightNode);	
	}
	
	public void postOrderTraversalRecur()
	{
		Node tempRoot = root;
		getPostOrderTraversalRecur(tempRoot);
	}
	
	public void getPostOrderTraversalRecur(Node tempRoot)
	{
		if(tempRoot == null)
			return;
		
		getPostOrderTraversalRecur(tempRoot.leftNode);
		getPostOrderTraversalRecur(tempRoot.rightNode);
		System.out.print(tempRoot+" ");
	}
	
	public void inOrderTraversalRecur()
	{
		Node tempRoot = root;
		getInOrderTraversalRecur(tempRoot);
	}
	
	public void getInOrderTraversalRecur(Node tempRoot)
	{
		if(tempRoot == null)
			return;
		
		getInOrderTraversalRecur(tempRoot.leftNode);
		System.out.print(tempRoot+" ");
		getInOrderTraversalRecur(tempRoot.rightNode);		
	}
	
	public static MyBinaryTree getSimpleBinaryTree()
	{
		MyBinaryTree tree = new MyBinaryTree();
		Node root = tree.getRoot();
		
		/*
		 * Creating a Simple Binary tree
		 *                 (1)
		 *                /   \
		 *             (2)     (3)
		 *             / \     / \
		 *          (4)  (5) (6) (7)
		 */
		
		root = new Node(1);
		root.setLeftNode(2);
		root.setRightNode(3);
		
		root.getLeftNode().setLeftNode(4);
		root.getLeftNode().setRightNode(5);
		
		root.getRightNode().setLeftNode(6);
		root.getRightNode().setRightNode(7);
		
		tree.setRoot(root);
		
		return tree;
	}
	
	public static MyBinaryTree getComplexBinaryTree()
	{
		MyBinaryTree tree = new MyBinaryTree();
		Node root = tree.getRoot();
		
		/*
		 * Creating a Simple Binary tree
		 *                  (1)
		 *                /    \
		 *             (2)      (3)
		 *             / \     /   \
		 *          (4)  (5) (6)    (7)
		 *           \        \     /  \ 
		 *           (8)	  (9)  (10) (11)
		 *           			   /  \
		 *                       (12) (13) 
		 */
		
		root = new Node(1);
		root.setLeftNode(2);
		root.setRightNode(3);
		
		root.getLeftNode().setLeftNode(4);
		root.getLeftNode().setRightNode(5);
		root.getLeftNode().getLeftNode().setRightNode(8);
		
		root.getRightNode().setLeftNode(6);
		root.getRightNode().setRightNode(7);
		root.getRightNode().getLeftNode().setRightNode(9);
		
		root.getRightNode().getRightNode().setLeftNode(10);
		root.getRightNode().getRightNode().setRightNode(11);
		
		root.getRightNode().getRightNode().getLeftNode().setLeftNode(12);
		root.getRightNode().getRightNode().getLeftNode().setRightNode(13);
		
		tree.setRoot(root);
		
		return tree;
	}
}
