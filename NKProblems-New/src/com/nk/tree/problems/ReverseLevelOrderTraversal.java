/*
 * Problem-8 : Give an algorithm for printing the level order data in reverse order. For example, the output for the
 * below tree should be: 4 5 6 7 2 3 1
 *                 (1)
 *                /   \
 *             (2)     (3)
 *             / \     / \
 *          (4)  (5) (6) (7) 
 */
package com.nk.tree.problems;

import java.util.ArrayDeque;
import java.util.Stack;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class ReverseLevelOrderTraversal
{
	public static void main(String[] args)
	{
		MyBinaryTree tree = MyBinaryTree.getSimpleBinaryTree();
		getReverseTraverse(tree);
	}
	
	public static void getReverseTraverse(MyBinaryTree tree)
	{
		ArrayDeque<Node> queue = new ArrayDeque<>();
		queue.add(tree.getRoot());
		Stack<Node> stack = new Stack<>();
		while(!queue.isEmpty())
		{
			Node temp = queue.poll();
			
			Node temp_left = temp.getLeftNode();
			Node temp_right = temp.getRightNode();
			
			if(temp_right!=null)
				queue.add(temp_right);
			
			if(temp_left!=null)
				queue.add(temp_left);
			
			stack.push(temp);
		}
		
		while(!stack.isEmpty())
		{
			System.out.print(stack.pop()+" ");
		}
	}
}
