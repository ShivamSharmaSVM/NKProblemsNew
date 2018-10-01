package com.nk.tree.main;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class LevelOrderTraversal
{
	public static void main(String[] args)
	{
		MyBinaryTree tree = MyBinaryTree.getComplexBinaryTree();
		getLevelOrderTraversal(tree);
	}
	
	public static void getLevelOrderTraversal(MyBinaryTree tree)
	{
		ArrayDeque<Node> queue = new ArrayDeque<>();
		queue.add(tree.getRoot());
		while(!queue.isEmpty())
		{
			Node temp = queue.pollFirst();
			System.out.print(temp+" ");
			Node left = temp.getLeftNode(); 
			if(left != null)
				queue.add(left);
			
			Node right = temp.getRightNode(); 
			if(right != null)
				queue.add(right);
				
		}
		
	}
}
