
package com.nk.tree.problems;

import com.nk.tree.core.MyBinaryTree;
import com.nk.tree.core.Node;

public class LeastCommonFactor
{
	public static void main(String[] args)
	{
		MyBinaryTree tree = MyBinaryTree.getComplexBinaryTree();
		System.out.println(LCS(tree.getRoot(),new Node(6), new Node(13)));
	}
	
	public static Node LCS(Node root, Node node1, Node node2)
	{
		if(node1 == null && node2==null)
			return null;
		
		if(!(node1!=null && node2!=null))
			return null;
		
		if(root == null)
			return null;
				
		if(root.isEqual(node1))
			return node1;
		
		if(root.isEqual(node2))
			return node2;
		
		Node left_node = LCS(root.getLeftNode(),node1, node2);
		Node right_node = LCS(root.getRightNode(),node1, node2);
		
		if(left_node!=null && right_node!=null)
			return root;
		
		if(left_node!=null)
			return left_node;
		
		if(right_node!=null)
			return right_node;
		
		return null;
	}
}