package com.nk.graph.main;

import com.nk.graph.core.Graph;

public class GraphTraversalMain
{
	public static void main(String[] args)
	{
		Graph graph = new Graph(5);
		/*
		 *       (A)---(B)
		 *        | \    \
		 *        |  \   (C)
		 *        |   \   /
		 *       (E)---(D)
		 */
		graph.addVertex('A');
		graph.addVertex('B');
		graph.addVertex('C');
		graph.addVertex('D');
		graph.addVertex('E');
		
		graph.addEdge('A','B');
		graph.addEdge('A','E');
		graph.addEdge('A','D');
		graph.addEdge('B','C');
		graph.addEdge('C','D');
		graph.addEdge('E','D');
		
		graph.printAdjMatrix();
		
		System.out.print("BFS Traversal: ");
		graph.bfs();
		
		System.out.print("\nDFS Traversal: ");
		graph.dfs();
	}
}
