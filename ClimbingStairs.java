public class ClimbingStairs {
	public static void main(String[] args) {
		System.out.println(climbStairs(44));
	}

	public static int climbStairs(int n) {
		int result = 0;
		int nm1 = 2;
		int nm2 = 1;
		if (n == 1) {
			result = 1;
		} else if (n == 2) {
			result = 2;
		} else {
			for (int i = 3; i <= n; i++) {
				result = nm1 + nm2;
				nm2 = nm1;
				nm1 = result;
			}
		}
		return result;
	}
}
