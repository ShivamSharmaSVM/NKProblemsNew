package com.nk.tree.problems;

import java.util.ArrayDeque;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;
import com.nk.tree.main.LevelOrderTraversal;
import com.nk.tree.main.PreOrderTraversalIterative;

public class InsertInBT
{

	public static void main(String[] args)
	{
		MyBinaryTree tree = MyBinaryTree.getComplexBinaryTree();
		insertElement(tree, 20);
		LevelOrderTraversal.getLevelOrderTraversal(tree);
		System.out.println();
		insertElement(tree, 21);
		insertElement(tree, 22);
		LevelOrderTraversal.getLevelOrderTraversal(tree);
	}

	public static void insertElement(MyBinaryTree tree, int value)
	{
		ArrayDeque<Node> queue = new ArrayDeque<>();
		queue.add(tree.getRoot());

		while (!queue.isEmpty())
		{
			Node temp = queue.poll();

			if (temp.getLeftNode() == null)
			{
				temp.setLeftNode(value);
				return;
			}

			if (temp.getRightNode() == null)
			{
				temp.setRightNode(value);
				return;
			}

			queue.add(temp.getLeftNode());
			queue.add(temp.getRightNode());
		}
	}
}
