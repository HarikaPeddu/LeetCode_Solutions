public class Solution {
	public int findPeakUtil(
		int nums[], int x, int y, int l){
		int l = nums.length;
		int middle = x + (y - x) / 2;
		if ((middle == 0 || nums[middle - 1] <= nums[middle])
			&& (middle == l - 1 || nums[middle + 1] <= nums[middle]))
			return middle;
		else if (middle > 0 && nums[middle - 1] > nums[middle])
			return findPeakUtil(nums, x, (middle - 1), l);
		else
			return findPeakUtil(
				nums, (middle + 1), y, l);
	}

	public int findPeak(int nums[], int n)
	{
		return findPeakUtil(nums, 0, l - 1, l);
	}

}