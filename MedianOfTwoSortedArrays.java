public class MedianOfTwoSortedArrays {
	public static void main(String[] args) {
		int nums1[] = { 1, 3, 5, 7, 9, 11 };
		int nums2[] = { 2, 4, 6, 8 };
		double d = findMedianSortedArrays(nums1, nums2);
		System.out.println(d);
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		if (m == 0 && n == 0) {
			return 0.0;
		}
		int arrays[] = new int[m + n];
		int j = 0;
		int k = 0;
		for (int i = 0; i < arrays.length; i++) {
			if (k == n || j < m && nums1[j] < nums2[k]) {
				arrays[i] = nums1[j];
				j++;
			} else if (j == m || k < n) {
				arrays[i] = nums2[k];
				k++;
			}
		}
		double result = 0.0;
		if ((m + n) % 2 != 0) {
			result = arrays[(m + n - 1) / 2];
		} else {
			result = (arrays[(m + n - 2) / 2] + arrays[(m + n) / 2]) / 2.0;
		}
		return result;
	}
}
