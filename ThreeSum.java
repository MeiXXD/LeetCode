import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
		int nums[] = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> result = threeSum(nums);
		System.out.println(result.toString());
	}

	public static List<List<Integer>> threeSum3(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int length = nums.length;
		for (int i = 0; i < length - 2; i++) {
			int a = nums[i];
			int start = i + 1;
			int end = length - 1;
			while (start < end) {
				int b = nums[start];
				int c = nums[end];
				if (a + b + c == 0) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(a);
					list.add(b);
					list.add(c);
					if (!result.contains(list)) {
						result.add(list);
					}
					start++;
					end--;
				} else if (a + b + c > 0) {
					end--;
				} else {
					start++;
				}
			}
		}
		return result;
	}

	public static List<List<Integer>> threeSum2(int[] nums) {
		if (nums == null || nums.length < 3) {
			return null;
		}
		int length = nums.length;
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		HashSet<List<Integer>> set = new HashSet<List<Integer>>();
		for (int i = 0; i < length - 2; i++) {
			for (int j = i + 1; j < length - 1; j++) {
				for (int k = j + 1; k < length; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> list = new ArrayList<Integer>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						if (!set.contains(list)) {
							set.add(list);
							result.add(list);
						}
					}
				}
			}
		}
		return result;
	}
	
	//best solution
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		int length = nums.length;
		for (int i = 0; i < length - 2; i++) {
			int a = nums[i];
			int start = i + 1;
			int end = length - 1;
			while (start < end) {
				int b = nums[start];
				int c = nums[end];
				if (a + b + c == 0) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(a);
					list.add(b);
					list.add(c);
					result.add(list);
					start++;
					end--;
					while (start < nums.length - 1
							&& nums[start] == nums[start - 1])
						start++;
					while (end > start && nums[end] == nums[end + 1])
						end--;
				} else if (a + b + c > 0) {
					end--;
				} else {
					start++;
				}
			}
			while (i != nums.length - 1 && nums[i] == nums[i + 1])
				i++;
		}
		return result;
	}
}
