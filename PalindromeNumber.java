public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println(isPalindrome(12221));
		System.out.println(isPalindrome(0));
		System.out.println(isPalindrome(-1));
		System.out.println(isPalindrome(121));
	}

	public static boolean isPalindrome(int x) {
		boolean result = false;
		long l = 0l;
		int temp = x;
		if (x < 0) {
			return result;
		} else {
			while (x != 0) {
				l = l * 10 + x % 10;
				x = x / 10;
			}
			if (l == temp) {
				result = true;
			}
		}
		return result;
	}
}
