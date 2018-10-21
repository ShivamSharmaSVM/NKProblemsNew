/*
 * Problem-20 : Given a binary tree, print out all of its root-to-leaf paths.(Recursive)
 */

package com.nk.tree.problems;

import java.util.Stack;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class PrintPathRecur
{
	public static void main(String[] args)
	{
		printPath(MyBinaryTree.getComplexBinaryTree().getRoot(), new Stack<Node>());
	}
	
	public static void printPath(Node root,Stack<Node> stack)
	{
		if(root.isExternal())
		{
			stack.push(root);
			System.out.println(stack);
			stack.pop();
		}
		else
		{
			
			if(root.hasLeftNode())
			{
				stack.push(root);
				printPath(root.getLeftNode(),stack);
				stack.pop();
			}	
			if(root.hasRightNode())
			{
				stack.push(root);
				printPath(root.getRightNode(), stack);
				stack.pop();
			}
		}
	}
}
