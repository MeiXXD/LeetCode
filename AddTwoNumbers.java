public class AddTwoNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode aRoot = new ListNode(9);
		ListNode a1 = new ListNode(9);
		aRoot.next = a1;
		a1.next = null;

		ListNode bRoot = new ListNode(0);
		bRoot.next = null;

		ListNode node = addTwoNumbers(aRoot, bRoot);
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode(0);
		ListNode result = l3;
		int temp = 0;
		while (l1 != null && l2 != null) {
			l3.next = l1;
			temp = l1.val + l2.val + temp / 10;
			l3.val = temp % 10;
			l3 = l3.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		if (l1 == null && l2 != null) {
			while (l2 != null) {
				l3.next = l2;
				temp = l2.val + temp / 10;
				l3.val = temp % 10;
				l3 = l3.next;
				l2 = l2.next;
			}
		}
		if (l2 == null && l1 != null) {
			while (l1 != null) {
				l3.next = l1;
				temp = l1.val + temp / 10;
				l3.val = temp % 10;
				l3 = l3.next;
				l1 = l1.next;
			}
		}
		if (l1 == null && l2 == null) {
			if (temp / 10 != 0) {
				l3.val = 1;
				l3.next = null;
			} else {
				ListNode node = result;
				while (node.next != l3) {
					node = node.next;
				}
				node.next = null;
			}
		}
		return result;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
