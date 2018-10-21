/*
 * Problem-17 : Given two binary trees, return true if they are structurally identical.
 */

package com.nk.tree.problems;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class FindStructurallyIdentical
{
	public static void main(String[] args)
	{
		System.out.println("Both Simple Tree: "+ isStructurallyIdentical(MyBinaryTree.getComplexBinaryTree().getRoot(), MyBinaryTree.getComplexBinaryTree().getRoot()));
	}
	
	public static boolean isStructurallyIdentical(Node root1, Node root2)
	{
		if(root1 == null && root1 == root2)
			return true;
		if(root1 != null && root2!=null && root1.isEqual(root2))
			return isStructurallyIdentical(root1.getLeftNode(), root2.getLeftNode()) && 
							isStructurallyIdentical(root1.getRightNode(), root2.getRightNode());
		return false;
	}
}
