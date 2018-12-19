package com.nk.tree.problems.bst;

import com.nk.tree.core.MyBinarySearchTree;

public class DeleteFromBSTMain
{
	public static void main(String[] args)
	{
		MyBinarySearchTree tree = MyBinarySearchTree.getComplexBinarySearchTree();
		tree.inoderTraversal();
		System.out.println();
		tree.delete(8);
		tree.inoderTraversal();
	}
}
