public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(reverse(123));
		System.out.println(reverse(-123));
	}

	public static int reverse(int x) {
		Long result = 0L;
		String s1 = Integer.toString(x);
		String s2 = "";
		char c = s1.charAt(0);
		if (c == '-') {
			s2 = s1.substring(1);
		} else {
			s2 = s1;
		}
		StringBuilder sb = new StringBuilder(s2);
		sb.reverse();
		String s3 = sb.toString();
		if (c == '-') {
			s3 = c + s3;
		}
		result = Long.parseLong(s3);
		return (int) ((result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0
				: result);
	}
}
