import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {

		Solution sol = new Solution();

	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution {

	// runtime :  -ms , memory  : 41.11 mb
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if(list1 == null || list2 == null)
			return (list1 == null ? list2 : list1);
		
		
		if(list1.val < list2.val) {
			list1.next = mergeTwoLists(list1.next,list2);
			return list1;
		}
		else {
			list2.next = mergeTwoLists(list1,list2.next);
			return list2;
		}

	}
	
	// runtime : -ms , memory :  40.95mb
	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		if (l1 == null) return l2;
		if (l2 == null) return l1;
			
		ListNode head = null;
		ListNode node = null;
		
		if (l1.val < l2.val) {
			head = l1;
			l1 = l1.next;
		} else {
			head = l2;
			l2 = l2.next;
		}
		node = head;
		
		
		while(l1 != null && l2 != null) {
			if(l1.val < l2.val) {
				node.next = l1;
				l1 = l1.next;
			}
			else {
				node.next = l2;
				l2 = l2.next;
			}
			
			node = node.next;
		}
		
		while(l1 != null) {
			node.next = l1;
			l1 = l1.next;
			node = node.next;
		}
		
		while(l2 != null) {
			node.next = l2;
			l2 = l2.next;
			node = node.next;
		}
		
		return head;
	}
}
