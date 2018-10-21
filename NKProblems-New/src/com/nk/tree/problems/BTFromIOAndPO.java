package com.nk.tree.problems;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class BTFromIOAndPO
{
	public static void main(String[] args)
	{
		MyBinaryTree tree = new MyBinaryTree(buildTree("425163","124536"));
		tree.preOrderTraversalRecur();
		tree.inOrderTraversalRecur();
	}
	
	public static Node buildTree(String inorder, String preorder)
	{
		String c = preorder.substring(0, 1);
		int root_index = inorder.indexOf(c);
		
		String left_tree = inorder.substring(0, root_index);
		String right_tree = inorder.substring(root_index+1);
		
		String leftPOTree  = preorder.substring(1,left_tree.length()+1);
		String rightPOTree  = preorder.substring(left_tree.length()+1);
		int root_value = Integer.parseInt(c);
		Node root = new Node(root_value);
		
		if(left_tree.length() > 0)
			root.setLeftNode(buildTree(left_tree, leftPOTree));
		
		if(right_tree.length() > 0)
			root.setRightNode(buildTree(right_tree, rightPOTree));
		
		return root;
	}
}
