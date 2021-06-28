class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int a = nums[0];
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum = 0;
            for (int j = i ; j < n;j++){
                sum = sum + nums[j];
                if(sum > a){
                    a = sum;
                }
                
            }
        }
        

        return a;
    }
}