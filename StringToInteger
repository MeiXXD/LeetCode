public class StringToInteger {
	public static void main(String[] args) {
		System.out.println(myAtoi("-9223372036854775809"));
		System.out.println(myAtoi("-000012"));
		System.out.println(myAtoi("+1212A12"));
		System.out.println(myAtoi("123 123"));
		System.out.println(myAtoi(""));
		System.out.println(myAtoi("  "));
		System.out.println(myAtoi("1"));

	}

	@SuppressWarnings("deprecation")
	public static int myAtoi(String str) {
		BigInteger result = null;
		try {
			str = str.trim();
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (Character.isLetter(c) || Character.isSpace(c)) {
					str = str.substring(0, i);
					break;
				}
			}
			result = new BigInteger(str);
		} catch (NumberFormatException e) {
			return 0;
		}
		BigInteger max = new BigInteger(String.valueOf(Integer.MAX_VALUE));
		BigInteger min = new BigInteger(String.valueOf(Integer.MIN_VALUE));
		if (result.compareTo(max) == 1) {
			return Integer.MAX_VALUE;
		} else if (result.compareTo(min) == -1) {
			return Integer.MIN_VALUE;
		} else {
			return result.intValue();
		}
	}
}
