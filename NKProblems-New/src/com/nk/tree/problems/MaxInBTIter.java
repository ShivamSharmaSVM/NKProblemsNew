/*
 * Problem-1 : Give an algorithm for finding maximum element in binary tree without recursion. 
 */

package com.nk.tree.problems;

import java.util.ArrayDeque;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class MaxInBTIter
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
	
	public static int getMax(Node root)
	{
		int max = Integer.MIN_VALUE;
		
		ArrayDeque<Node> queue = new ArrayDeque<>();
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			Node temp = queue.poll();
			
			if(temp.getValue() > max)
				max = temp.getValue();
			
			if(temp.getLeftNode()!= null)
				queue.add(temp.getLeftNode());
			
			if(temp.getRightNode()!= null)
				queue.add(temp.getRightNode());
		}
		
		return max;
	}
}
