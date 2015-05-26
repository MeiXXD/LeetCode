public class MergeTwoSortedLists {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l11 = new ListNode(5);
		ListNode l2 = new ListNode(3);
		ListNode l21 = new ListNode(4);
		ListNode l22 = new ListNode(9);
		l1.next = l11;
		l11.next = null;
		l2.next = l21;
		l21.next = l22;
		l22.next = null;
		ListNode root = mergeTwoLists(l1, l2);
		while (root != null) {
			System.out.print(root.val + " ");
			root = root.next;
		}
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode root = null;
		if (l1.val <= l2.val) {
			root = l1;
			l1 = l1.next;
		} else {
			root = l2;
			l2 = l2.next;
		}
		root.next = mergeTwoLists(l1, l2);
		return root;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
