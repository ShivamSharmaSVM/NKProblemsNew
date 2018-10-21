package com.nk.sorting.core;

public class QuickSort
{
	public static void main(String[] args)
	{
		int[] arr = { 10, 30, 50, 40, 100, 20, 60 };
		quickSorting(arr, 0, arr.length-1);
		SelectionSort.printArray(arr);
	}

	public static void quickSorting(int[] arr, int left, int right)
	{
		if (left < right)
		{
			int j = partition(arr, left, right);
			quickSorting(arr, left, j - 1);
			quickSorting(arr, j + 1, right);
		}
	}

	private static int partition(int[] arr, int left, int right)
	{
		while(true)
		{
			int pivot = arr[left];
			int p = left+1;
			int q = right;
			
			while(p<arr.length && arr[p]<pivot)
			{
				p++;
			}
			while(q>0 && arr[q]>pivot)
			{
				q--;
			}
			
			if(p<q)
			{
				int temp = arr[p];
				arr[p] = arr[q];
				arr[q] = temp;
			}
			else
			{
				int temp = arr[q];
				arr[q] = pivot;
				arr[left] = temp;
				return q;
			}
		}
	}
}
