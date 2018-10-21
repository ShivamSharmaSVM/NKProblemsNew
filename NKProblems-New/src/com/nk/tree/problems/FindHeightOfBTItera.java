/*
 * Problem-11 : Give an algorithm for finding the height(or depth) of the binary 
 * 				tree. 
 */

package com.nk.tree.problems;

import java.util.ArrayDeque;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class FindHeightOfBTItera
{
	static final Node SPECIAL_NODE = new Node(Integer.MIN_VALUE);

	public static void main(String[] args)
	{
		MyBinaryTree tree = MyBinaryTree.getSimpleBinaryTree();
		int height = getHieght(tree);
		System.out.println("Height: " + height);
	}

	public static int getHieght(MyBinaryTree tree)
	{
		int level = 0;
		ArrayDeque<Node> queue = new ArrayDeque<>();

		Node root = tree.getRoot();
		if (root == null)
			return -1;

		queue.add(tree.getRoot());
		queue.add(SPECIAL_NODE);
		while (!queue.isEmpty())
		{
			Node temp = queue.poll();
			if (isSpecial(temp))
			{
				if (!queue.isEmpty())
					queue.add(SPECIAL_NODE);
				level++;
			} else
			{
				Node temp_left = temp.getLeftNode();
				Node temp_right = temp.getRightNode();

				if (temp_left != null)
					queue.add(temp_left);

				if (temp_right != null)
					queue.add(temp_right);
			}
		}
		return level;
	}

	public static boolean isSpecial(Node node)
	{
		return node.getValue() == Integer.MIN_VALUE;
	}
}
