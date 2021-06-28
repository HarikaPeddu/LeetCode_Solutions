class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        
        var noDupIdx = 0;       

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[noDupIdx]) {
                nums[++noDupIdx] = nums[i];
            }            
        }
        
        return noDupIdx + 1;
    }
}