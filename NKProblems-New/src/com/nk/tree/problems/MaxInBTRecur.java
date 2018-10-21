/*
 * Problem-1 : Give an algorithm for finding maximum element in binary tree. 
 */

package com.nk.tree.problems;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class MaxInBTRecur
{

	public static void main(String[] args)
	{
		MyBinaryTree tree = MyBinaryTree.getComplexBinaryTree();
		if(tree.getRoot() != null)			
		{
			int max = getMax(tree.getRoot());
			System.out.print("Max: "+max);
		}
	}

	public static int getMax(Node tree)
	{
		if(tree.isExternal())
			return tree.getValue();
		
		int left_max = Integer.MIN_VALUE;
		int right_max = Integer.MIN_VALUE;
		int node_value = tree.getValue();
		int max = 0;
		
		Node left_node = tree.getLeftNode();
		Node right_node = tree.getRightNode();
		
		if(left_node != null)
			left_max = getMax(tree.getLeftNode());
		
		if(right_node != null)	
			right_max = getMax(tree.getRightNode());
		
		if(left_node != null && right_node != null)
		{
			max = (left_max>right_max) ? left_max : right_max;
			max = (node_value>max) ? node_value : max;
		}
		else if(left_node == null)
			max = (node_value>right_max) ? node_value : right_max;
		else if(right_node == null)
			max = (node_value>left_max) ? node_value : left_max;
		
		return max;
	}
}
