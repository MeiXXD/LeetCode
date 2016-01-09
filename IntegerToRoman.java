public class IntegerToRoman {
	public static void main(String[] args) {
		System.out.println(intToRoman(3201));
		System.out.println(intToRoman(4321));
	}

	public static String intToRoman(int num) {
		String result = "";
		String digit[] = { "", "I", "II", "III", "IV", "V", "VI", "VII",
				"VIII", "IX" };
		String ten[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX",
				"XC" };
		String hundreds[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC",
				"DCCC", "CM" };
		String thousand[] = { "", "M", "MM", "MMM" };
		if (num < 1 || num > 3999) {
			return result;
		} else {
			result = thousand[num / 1000] + hundreds[num % 1000 / 100]
					+ ten[num % 1000 % 100 / 10] + digit[num % 1000 % 100 % 10];
			return result;
		}
	}
}
