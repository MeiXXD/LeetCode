public class TwoSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 0, 4, 1, 0 };
		int target = 0;
		int result[] = twoSum(nums, target);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		int temp01 = 0;
		int temp02 = 0;
		int result[] = new int[2];
		boolean mark = false;
		for (int i = 0; i < nums.length; i++) {
			temp01 = i;
			temp02 = target - nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == temp02) {
					temp02 = j;
					mark = true;
					result[0] = temp01 + 1;
					result[1] = temp02 + 1;
					break;
				}
			}
			if (mark) {
				break;
			}
		}
		return result;
	}
}
