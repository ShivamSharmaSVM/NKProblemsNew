package com.nk.sorting.core;

public class MergeSort
{
	public static void main(String[] args)
	{
		int[] arr = { 10, 30, 50, 40, 100, 20, 60 };
		mergeSorting(arr, 0, arr.length-1);
		SelectionSort.printArray(arr);
	}

	public static void mergeSorting(int[] arr, int left, int right)
	{
		if (left < right)
		{
			int middle = (left + right) / 2;
			mergeSorting(arr, left, middle);
			mergeSorting(arr, middle + 1, right);

			merge(arr, left, middle, right);
		}
	}

	private static void merge(int[] arr, int left, int middle, int right)
	{
		int n1 = middle-left+1;
		int n2 = right-middle;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for (int i = 0; i < n1; i++)
		{
			L[i] = arr[left+i];
		}
		
		for (int j = 0; j < n2; j++)
		{
			R[j] = arr[middle+j+1];
		}
		
		int i=0, j=0;
		int k=left;
		
		while(i<n1 && j<n2)
		{
			if(L[i]<=R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}

			k++;
		}
		
		while(i<n1)
		{
			arr[k] = L[i];
			k++;
			i++;
		}
		
		while(j<n2)
		{
			arr[k] = R[j];
			k++;
			j++;
		}
	}
}
