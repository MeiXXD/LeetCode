public boolean hasCycle(ListNode head) {
		if (head == null) {
			return false;
		}
		ListNode one = head;
		ListNode two = head;
		boolean result = false;
		while (one.next != null && two.next != null && two.next.next != null) {
			one = one.next;
			two = two.next.next;
			if (one == two) {
				result = true;
				break;
			}
		}
		return result;
	}

	public ListNode detectCycle(ListNode head) {
		boolean result = false;
		if (head == null) {
			return null;
		}
		ListNode one = head;
		ListNode two = head;
		while (one.next != null && two.next != null && two.next.next != null) {
			one = one.next;
			two = two.next.next;
			if (one == two) {
				result = true;
				break;
			}
		}
		if (result) {
			one = head;
			while (one != two) {
				one = one.next;
				two = two.next;
			}
			result = false;
		} else {
			return null;
		}
		return one;
	}
