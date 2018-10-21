package com.nk.sorting.core;

public class InsertionSort
{	
	public static void main(String[] args)
	{
		int[] arr = { 10, 30, 50, 40, 100, 20, 60 };
		insertionSorting(arr);
		SelectionSort.printArray(arr);
	}

	public static void insertionSorting(int arr[])
	{
		for(int i=1; i<arr.length;i++)
		{
			int key = arr[i];
			for(int j=i-1; j>=0; j--)
			{
				if(arr[j] > key)
					arr[j+1] = arr[j];
				else
				{
					arr[j+1] = key;
					break;
				}
			}
		}
	}
}
