package com.nk.tree.main;

import com.nk.tree.core.MyBinarySearchTree;
import com.nk.tree.core.Node;

public class FindInBSTRecur
{
	public static void main(String[] args)
	{
		MyBinarySearchTree bst = MyBinarySearchTree.getSimpleBinarySearchTree();
		Node n = bst.find(bst.getRoot(), 5);
		System.out.println(n);
		n = bst.find(bst.getRoot(), 15);
		System.out.println(n);
	}
}
