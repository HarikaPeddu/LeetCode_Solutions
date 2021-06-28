class Solution {
    private int[] merge(int arr1[],int arr2[]){
        int i=0;
        int j=0;
        int k=0;
        int res[]=new int[arr1.length+arr2.length];
        
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>=arr2[j]){
                res[k++]=arr2[j];
                j++;
            }
            else{
                res[k++]=arr1[i];
                i++;
            }
            
        }
        while(i<arr1.length){
            res[k++]=arr1[i];
            i++;
        }
        while(j<arr2.length){
            res[k++]=arr2[j];
            j++;
        }
        return res;
    }
    private int[] mergeSort(int arr[],int low,int high){
        if(low==high){
            int ba[]=new int[1];
            ba[0]=arr[low];
            return ba;
        }
        
        int mid=(low+high)/2;
        int fsh[]=mergeSort(arr,low,mid);
        int ssh[]=mergeSort(arr,mid+1,high);
       return merge(fsh,ssh);
       
    }
    public int[] sortArray(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
       
    }
}