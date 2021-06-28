class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        int i, j;
        int min_dist = Integer.MAX_VALUE;
        for (i = 0; i < n; i++)
        {
            
            if ((target == nums[i] && min_dist > Math.abs(i - start)))
                    min_dist = Math.abs(i - start);
           
        }
        return min_dist;
        
    }
}