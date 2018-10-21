/*
 * Problem-3: Give an algorithm for searching an element in binary tree;
 */

package com.nk.tree.problems;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class FindInBTRecur
{
	public static void main(String[] args)
	{
		MyBinaryTree tree = MyBinaryTree.getComplexBinaryTree();
		System.out.println(find(tree.getRoot(), 8));
		System.out.println(find(tree.getRoot(), -11));
	}

	public static boolean find(Node root, int value)
	{
		boolean isPresent = false;
		if(root.getValue() == value)
			isPresent = true;
		else
		{
			Node left_node = root.getLeftNode();
			Node right_node = root.getRightNode();
			if(left_node != null)
				isPresent = find(left_node, value);
			
			if(!isPresent)
			{
				if(right_node != null)
					isPresent = find(right_node, value);
			}
		}
		return isPresent;
	}
}
