/*
 *  Problem-14 : Give an algorithm for finding the number of leaves in the binary tree without recursion. 
 */

package com.nk.tree.problems;

import java.util.ArrayDeque;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class FindNumberOfLeaves
{
	public static void main(String[] args)
	{
		MyBinaryTree tree = MyBinaryTree.getComplexBinaryTree();
		System.out.println("No. of Leaves: "+getLeavesCount(tree));
	}
	public static int getLeavesCount(MyBinaryTree tree)
	{
		int count = 0;
		ArrayDeque<Node> queue =  new ArrayDeque<>();
		queue.add(tree.getRoot());
		while(!queue.isEmpty())
		{
			Node temp = queue.poll();
			if(temp.isExternal())
				count++;
			else
			{
				if(temp.getLeftNode()!=null)
					queue.add(temp.getLeftNode());
				if(temp.getRightNode()!=null)
					queue.add(temp.getRightNode());
			}
		}
		return count;
	}
}
