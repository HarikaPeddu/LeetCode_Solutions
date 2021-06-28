class Solution {
    public int coinChange(int[] coins, int amount) {      
    int[] arr = new int[amount+1];
 
    Arrays.fill(arr, Integer.MAX_VALUE);
    arr[0]=0;
 
    for(int i=1; i<=amount; i++){
        for(int coin: coins){
            if(i==coin){
                arr[i]=1;
            }else if(i>coin){
                if(arr[i-coin]==Integer.MAX_VALUE){
                    continue;
                }
                arr[i]=Math.min(arr[i-coin]+1, arr[i]);
            }
        }
    }
 
    if(arr[amount]==Integer.MAX_VALUE){
        return -1;
    }
 
    return arr[amount];
        
    }
}