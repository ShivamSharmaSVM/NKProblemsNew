package com.nk.sorting.core;

public class BubbleSort
{
	public static void main(String[] args)
	{
		int[] arr = { 10, 30, 50, 40, 100, 20, 60 };
		optimizeBubbleSorting(arr);
		SelectionSort.printArray(arr);
	}
	
	public static void bubbleSorting(int arr[])
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 1; j < arr.length-i; j++)
			{
				if(arr[j-1]>arr[j])
				{
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void optimizeBubbleSorting(int arr[])
	{
		boolean swap = false;
		for (int i = 0; i < arr.length && !swap; i++)
		{
			swap = true;
			for (int j = 1; j < arr.length-i; j++)
			{
				
				if(arr[j-1]>arr[j])
				{
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					swap = false;
				}
			}
		}
	}
}
