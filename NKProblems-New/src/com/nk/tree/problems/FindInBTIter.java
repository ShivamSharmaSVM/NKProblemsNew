package com.nk.tree.problems;

import java.util.Stack;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class FindInBTIter
{
	public static void main(String[] args)
	{
		MyBinaryTree tree = MyBinaryTree.getComplexBinaryTree();
		System.out.println(find(tree.getRoot(), 8));
		System.out.println(find(tree.getRoot(), -11));
	}
	
	public static boolean find(Node root, int value)
	{
		Node current = root;
		Stack<Node> stack = new Stack<>();
		while(current!= null || !stack.isEmpty())
		{
			if(current != null)
			{
				stack.push(current);
				current = current.getLeftNode();
			}
			else
			{
				Node temp = stack.pop();
				/*
				 * Note:-**We can also compare the value before pushing the node on stack(before "stack.push(current);" 
				 *         statement) and that would be more efficient but,here we are following inorder traversal 
				 *         so, we are evaluating the node after the evaluation of its left tree.	 
				 */
				if(temp.getValue() == value)   
				{
					return true;
				}
				if(temp.getRightNode()!=null)
					current = temp.getRightNode();
			}
		}
		
		return false;
	}
}
