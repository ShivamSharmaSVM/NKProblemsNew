package com.nk.tree.main;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class PreOrderTraversalRecur
{
	public static void main(String args[])
	{
		MyBinaryTree tree = MyBinaryTree.getSimpleBinaryTree();
		tree.preOrderTraversalRecur();
	}
}
