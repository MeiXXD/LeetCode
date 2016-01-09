public class RemoveLinkedListElements {
	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(6);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(6);
		head.next = one;
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = null;

		ListNode result = removeElements(head, 6);
		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}

	public static ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return null;
		}
		while (head != null && head.val == val) {
			head = head.next;
		}
		if (head == null) {
			return null;
		}
		ListNode result = head;
		ListNode p = head;
		head = head.next;
		while (head != null) {
			if (head.val == val) {
				p.next = head.next;
			} else {
				p = p.next;
			}
			head = head.next;
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
