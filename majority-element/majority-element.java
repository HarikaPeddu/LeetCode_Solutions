class Solution {
  public static int majorityElement(int[] nums) {
       int l=nums.length;
        int k=l/2;
        if (nums == null) {
            return 0;
        }
      else
              return select(nums,0,l-1,k);
    }
    public static int select(int[] a, int b, int c, int d) {
        int v=a[c];
        int left=b;
        int right=c;
        while(left<right) {
            while(a[left]<v && left<right)
                left++;
            while(a[right]>=v && left<right)
                right--;
            if (left == right)
                break;
            int swap=a[left];
            a[left]=a[right];
            a[right]=swap;
        }
        int swap=a[c];
        a[c]=a[right];
        a[right]=swap;

        if(left==d)
            return v;
        else if(left>d)
            return select(a,b,left-1,d);
        else
            return select(a,right+1,c,d);
    }
}