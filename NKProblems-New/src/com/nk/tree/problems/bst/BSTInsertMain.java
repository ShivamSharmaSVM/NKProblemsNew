package com.nk.tree.problems.bst;

import com.nk.tree.core.MyBinarySearchTree;
import com.nk.tree.core.Node;

public class BSTInsertMain
{
	public static void main(String[] args)
	{
		MyBinarySearchTree tree = new MyBinarySearchTree();
		
		tree.insert(new Node(10));
		tree.insert(new Node(6));
		tree.insert(new Node(16));
		tree.insert(new Node(4));
		tree.insert(new Node(8));
		tree.insert(new Node(7));
		tree.insert(new Node(13));
		
		tree.inoderTraversal();
	}
}
