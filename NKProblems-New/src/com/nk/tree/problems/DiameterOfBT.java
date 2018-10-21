/*
 * Problem-18 : Give an algorithm for finding the diameter of the binary tree.
 */
package com.nk.tree.problems;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class DiameterOfBT
{
	public static void main(String[] args)
	{
		MyBinaryTree tree = MyBinaryTree.getComplexBinaryTree();
		System.out.println(getDiameter(tree.getRoot()));
	}
	
	public static int getDiameter(Node root)
	{
		if(root == null)
			return 0;
		
		int lheight = height(root.getLeftNode());
		int rheight = height(root.getRightNode());
		
		int left_diameter = getDiameter(root.getLeftNode());
		int right_diameter = getDiameter(root.getRightNode());
		
		return Math.max((lheight+rheight+1),Math.max(left_diameter, right_diameter));
	}
	
	public static int height(Node root)
	{
		if(root == null)
			return 0;
		
		int lheight = height(root.getLeftNode())+1;
		int rheight = height(root.getRightNode())+1;
		
		return Math.max(lheight, rheight);
	}
}
