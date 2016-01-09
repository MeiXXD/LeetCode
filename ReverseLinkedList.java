public class ReverseLinkedList {
	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);
		head.next = one;
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = null;
		ListNode result = reverseList(head);
		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}

	public static ListNode reverseList(ListNode head) {
		if (head == null) {
			return null;
		}
		LinkedList<ListNode> stack = new LinkedList<ListNode>();
		while (head.next != null) {
			stack.add(head);
			head = head.next;
		}
		ListNode result = head;
		ListNode node = null;
		while (!stack.isEmpty()) {
			node = head;
			head = stack.removeLast();
			node.next = head;
		}
		head.next = null;
		return result;
	}
	
	public static ListNode reverseList2(ListNode head) {
		ListNode p = head;
		ListNode q = null;
		while (p != null) {
			ListNode temp = p.next;
			p.next = q;
			q = p;
			p = temp;
		}
		return q;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
