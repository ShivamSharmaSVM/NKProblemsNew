/*
 * Problem-25 : Given two trees, give an algorithm for checking whether they are mirrors of each other.
 */

package com.nk.tree.problems;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class CheckMirrors
{
	public static void main(String[] args)
	{
		MyBinaryTree tree = MyBinaryTree.getComplexBinaryTree();
		MyBinaryTree mirrorTree = new MyBinaryTree(MirrorBinaryTree.getMirrorTree(tree.getRoot()));
		
		tree.inOrderTraversalRecur();
		mirrorTree.inOrderTraversalRecur();
		
		System.out.println("Is Mirror: "+ areMirrors(tree.getRoot(), mirrorTree.getRoot()));
		System.out.println("Is Mirror: "+ areMirrors(tree.getRoot(), MyBinaryTree.getComplexBinaryTree().getRoot()));
	}
	
	public static boolean areMirrors(Node root1, Node root2)
	{
		if (root1==null && root2==null)
			return true;
		
		if(!(root1!=null && root2!=null))
			return false;
		
		if(!root1.equals(root2))
			return false;
		
		boolean isLeftMirror = areMirrors(root1.getLeftNode(), root2.getRightNode());
		boolean isRightMirror = areMirrors(root1.getRightNode(),root2.getLeftNode());
		return (isLeftMirror && isRightMirror);
	}
}
