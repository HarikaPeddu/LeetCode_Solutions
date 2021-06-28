class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int number : nums){
            sum = sum + number;
       }
        if (sum % 2 != 0){
            return false;}

        int neededSum = sum / 2;

        boolean [][] arr = new boolean[nums.length + 1][neededSum+1];

        for (int i=0; i<=nums.length; i++) {
            for (int j=0; j<=neededSum; j++) {
                if (i == 0 || j == 0)
                    arr[i][j] = false;
                else if (nums[i-1] > j) {
                    arr[i][j] = arr[i-1][j];
                }
                else if (nums[i-1] == j)
                    arr[i][j] = true;
                else
                    arr[i][j] = arr[i-1][j] || arr[i-1][j - nums[i-1]];
            }
        }
        return arr[nums.length][neededSum];
    }
}
