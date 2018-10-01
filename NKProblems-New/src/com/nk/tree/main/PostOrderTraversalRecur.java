package com.nk.tree.main;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class PostOrderTraversalRecur
{
	public static void main(String args[])
	{
		MyBinaryTree tree = MyBinaryTree.getSimpleBinaryTree();
		tree.postOrderTraversalRecur();
	}
}
