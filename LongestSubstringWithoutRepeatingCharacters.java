public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		String s = "abcabcddase";
		int result = lengthOfLongestSubstring(s);
		System.out.println(result);
	}

	public static int lengthOfLongestSubstring(String s) {
		if (s == null) {
			return 0;
		}
		int length = s.length();
		int temp = 0;
		int result = 0;
		int begin = 0;
		int end = 0;
		HashSet<Character> set = new HashSet<Character>();
		while (end != length) {
			if (set.contains(s.charAt(end))) {
				while (s.charAt(begin) != s.charAt(end)) {
					set.remove(s.charAt(begin));
					begin++;
					temp--;
				}
				begin++;
				end++;
			} else {
				set.add(s.charAt(end));
				temp++;
				end++;
				result = Math.max(result, temp);
			}
		}
		return result;
	}
}
