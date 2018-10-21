package com.nk.tree.problems;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class MirrorBinaryTree
{
	public static void main(String[] args)
	{
		MyBinaryTree originalTree =  MyBinaryTree.getComplexBinaryTree();
		MyBinaryTree mirrorTree = new MyBinaryTree(getMirrorTree(originalTree.getRoot()));
		originalTree.inOrderTraversalRecur();
		mirrorTree.inOrderTraversalRecur();
	}
	
	public static Node getMirrorTree(Node root)
	{
		if(root == null)
			return null;
		
		Node node = new Node(root.getValue());
		node.setLeftNode(getMirrorTree(root.getRightNode()));
		node.setRightNode(getMirrorTree(root.getLeftNode()));
		return node;
	}
}
