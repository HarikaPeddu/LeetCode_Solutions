class Solution {
    public int sumBase(int n, int k) {
        int O; 
        int Total = 0;
    while (n > 0)
    {
        O = n % k;
        Total = Total+ O;
        n = n / k;
    }
    return Total;
        
    }
}