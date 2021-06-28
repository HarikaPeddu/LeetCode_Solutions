class Solution {
    public int lengthOfLIS(int[] nums) {
     int n = nums.length;
     int arr[] = new int[n];
     int i,j,max = 0; 
           for ( i = 0; i < n; i++ ) 
              arr[i] = 1; 
           for ( i = 1; i < n; i++ ) 
              for ( j = 0; j < i; j++ )  
                         if ( nums[i] > nums[j] &&  
                                  arr[i] < arr[j] + 1) 
                    arr[i] = arr[j] + 1; 
           for ( i = 0; i < n; i++ ) 
              if ( max < arr[i] ) 
                 max = arr[i]; 
  
            return max;    
    }
}