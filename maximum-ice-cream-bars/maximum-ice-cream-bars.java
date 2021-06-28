class Solution {
    public int maxIceCream(int[] costs, int coins) {
       int temp=0;
        int total=0;
        int n = costs.length;
        Arrays.sort(costs);
        for(int x=0;x<n;x++){
            int a = costs[x];
            total=total+a;
            if((total<coins) | (total==coins)){
                temp=temp+1;
            }
            else
                break;
        }
        return temp;
    }
}