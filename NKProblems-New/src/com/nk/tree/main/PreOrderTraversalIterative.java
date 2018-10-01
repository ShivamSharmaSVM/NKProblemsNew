package com.nk.tree.main;

import java.util.Stack;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class PreOrderTraversalIterative
{
	public static void main(String args[])
	{
		MyBinaryTree tree = MyBinaryTree.getSimpleBinaryTree();
		preOrderTraversal(tree);
	}
	
	public static void preOrderTraversal(MyBinaryTree tree)
	{
		if(tree != null)
		{
			Stack<Node> stack = new Stack<>();
			Node root = tree.getRoot();
			stack.push(root);
			while(!stack.isEmpty())
			{
				Node temp = stack.pop();
				System.out.print(temp+" ");
				if(temp.isExternal())
				{
					continue;
				}
				
				if(temp.getRightNode() != null)
					stack.push(temp.getRightNode());
				
				if(temp.getLeftNode() != null)
					stack.push(temp.getLeftNode());
			}
		}
	}
}
