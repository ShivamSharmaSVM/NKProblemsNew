/*
 * Problem-9 : Give an algorithm to delete the tree.
 */

package com.nk.tree.problems;

import java.util.Stack;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class DeleteBinaryTree
{
	public static void main(String[] args)
	{
		MyBinaryTree tree = MyBinaryTree.getComplexBinaryTree();
		deleteBinaryTree(tree);
		deleteBinaryTree(tree);
	}
	
	public static void deleteBinaryTree(MyBinaryTree tree)
	{
		if(tree == null || tree.getRoot() == null)
		{
			System.out.println("NULL");
			return;
		}
		Stack<Node> stack = new Stack<>();
		Node current = tree.getRoot();
		while(current!=null || !stack.isEmpty())
		{
			if(current != null)
			{
				stack.push(current);
				current = current.getLeftNode();
			}
			else
			{
				Node temp = stack.peek().getRightNode();
				if(temp == null)
				{
					temp = stack.pop(); 
					System.out.print(temp + " ");
					
					if(temp != stack.peek().getRightNode())
					{
						temp = null;
					}
					while(!stack.isEmpty() && temp == stack.peek().getRightNode())
					{	
						temp = null;
						temp = stack.pop();
						System.out.print(temp + " ");
					}
				}
				else
				{
					current = temp;
				}
			}
		}
		tree.setRoot(null);
		System.out.println();
	}
}
