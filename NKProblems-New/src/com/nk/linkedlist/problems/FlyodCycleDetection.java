
/*
 * Problem-6,9,11 : Check whether the given linked list is either NULL-terminated or ends in a cycle(cyclic).
 */

package com.nk.linkedlist.problems;

import com.nk.linkedlist.core.MyCircularLinkedList;
import com.nk.linkedlist.core.MyLinkedList;
import com.nk.linkedlist.core.Node;

public class FlyodCycleDetection
{
	public static void main(String args[])
	{
		MyLinkedList<Integer> floydList = new MyLinkedList<>();
		floydList.addAtLast(25);
		floydList.addAtLast(15);
		floydList.addAtLast(45);
		floydList.printAll();

		MyCircularLinkedList<Integer> cycle = new MyCircularLinkedList<>();
		cycle.addAtLast(10);
		cycle.addAtLast(20);
		cycle.addAtLast(50);
		cycle.addAtLast(40);
		cycle.addAtLast(30);
		cycle.printAll();

		floydList.attach(cycle);

		/*
		 * Just to confirm the Floyd list is ready with cycle in it.
		 * 
		 * Node<Integer> current = floydList.getHead();
		 *  
		 * for (int i = 0; i < 9; i++) 
		 * { 
		 *    System.out.print(current+"==>"); 
		 *    current = current.next; 
		 * }
		 */
		
		Node<Integer> startNodeOfLoop = isCyclePresent(floydList);
		
		if(startNodeOfLoop == null)
			System.out.println("No Cycle Found");
		else
			System.out.println("Starting node of loop: "+startNodeOfLoop);
	}

	public static Node<Integer> isCyclePresent(MyLinkedList<Integer> floydList)
	{
		Node<Integer> fastPtr = floydList.getHead();
		Node<Integer> slowPtr = floydList.getHead();

		if (fastPtr != null)
		{
			if (fastPtr.next == null || fastPtr.next.next == null)
			{
				return null;
			}
			fastPtr = fastPtr.next;
			fastPtr = fastPtr.next;
			slowPtr = slowPtr.next;
		}

		while (fastPtr != null && fastPtr != slowPtr)
		{
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next;
			if (fastPtr == null)
			{
				return null;
			}
			fastPtr = fastPtr.next;
		}
		
		if (fastPtr == null)
		{
			return null;
		}
		
		slowPtr = floydList.getHead();
		
		while (fastPtr != slowPtr)
		{
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next;
		}		
		
		return fastPtr;
	}
}
