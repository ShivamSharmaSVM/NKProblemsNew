package com.nk.graph.core;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

class Vertex
{
	public char label;
	public boolean visited;
	
	public Vertex(char lab)
	{
		label = lab;
		visited = false;
	}
	
	@Override
	public String toString()
	{
		return label+"";
	}
}

public class Graph
{
	private int maxVertices;
	private Vertex vertexList[];
	private int adjMatrix[][];
	private int vertexCount;
	
	public Graph()
	{
		this(20);
	}
	
	public Graph(int maxV)
	{
		maxVertices = maxV;
		vertexList = new Vertex[maxVertices];
		adjMatrix = new int[maxVertices][maxVertices];
		vertexCount = 0;
	}
	
	public void addVertex(char lab)
	{
		vertexList[vertexCount++] = new Vertex(lab);
	}
	
	public boolean addEdge(char startChar, char endChar)
	{
		int start = getIndex(startChar);
		int end = getIndex(endChar);
		
		if(start==-1 || end==-1)
			return false;
		
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
		
		return true;
	}
	
	public int getIndex(char vertex)
	{
		for(int i=0; i<vertexCount; i++)
			if(vertexList[i].label==vertex)
				return i;
		return -1;
	}
	public void displayVertex(int v)
	{
		System.out.print(vertexList[v]+" ");
	}
	
	public void bfs()
	{
		Queue<Integer> theQueue = new ArrayDeque<>();
		
		vertexList[0].visited = true;
		displayVertex(0);
		theQueue.offer(0);
		int adjVertex;
		
		while(!theQueue.isEmpty())
		{
			int currentVertex = theQueue.poll();
			while((adjVertex=getAdjUnvisitedVertex(currentVertex))!=-1)
			{
				vertexList[adjVertex].visited=true;
				displayVertex(adjVertex);
				theQueue.offer(adjVertex);
			}
		}
		
		for (int i = 0; i < vertexList.length; i++)
		{
			vertexList[i].visited = false;
		}
	}

	public void dfs()
	{
		vertexList[0].visited = true;
		Stack<Integer> stack = new Stack();
		stack.push(0);
		int adjVertex;
		
		while(!stack.isEmpty())
		{
			int currentVertex = stack.pop();
			displayVertex(currentVertex);
			while((adjVertex = getAdjUnvisitedVertex(currentVertex))!=-1)
			{
				vertexList[adjVertex].visited = true;
				stack.push(adjVertex);
			}
		}
		
		for (int i = 0; i < vertexList.length; i++)
		{
			vertexList[i].visited = false;
		}
	}

	
	public int getAdjUnvisitedVertex(int v)
	{
		for(int j=0; j<vertexCount; j++)
		{
			if(adjMatrix[v][j]==1 && vertexList[j].visited==false)
				return j;
		}
		return -1;
	}
	
	public void printAdjMatrix()
	{
		System.out.print("  ");
		for (int i = 0; i < vertexCount; i++)
			System.out.print(vertexList[i]+" ");
		
		System.out.println();
		for (int i = 0; i < vertexCount; i++)
		{
			System.out.print(vertexList[i]+" ");
			for (int j = 0; j < vertexCount; j++)
			{
				System.out.print(adjMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
