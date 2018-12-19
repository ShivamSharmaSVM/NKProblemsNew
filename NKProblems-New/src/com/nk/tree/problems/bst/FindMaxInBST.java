package com.nk.tree.problems.bst;

import com.nk.tree.core.MyBinarySearchTree;

public class FindMaxInBST
{
	public static void main(String[] args)
	{
		MyBinarySearchTree bst = MyBinarySearchTree.getComplexBinarySearchTree();
		bst.inoderTraversal();
		System.out.println();
		System.out.println("Max Element: "+bst.findMax());
	}
}
