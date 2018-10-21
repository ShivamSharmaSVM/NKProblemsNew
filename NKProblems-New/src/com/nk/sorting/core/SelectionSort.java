package com.nk.sorting.core;

public class SelectionSort
{
	public static void main(String[] args)
	{
		int[] arr = {10,30,50,40,100,20,60};
		selectionSorting(arr);
		printArray(arr);
	}
	
	public static void selectionSorting(int arr[])
	{
		for (int i = 0; i < arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j] < arr[i])
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	public static void printArray(int arr[])
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
