class Solution {
    
   public static int minDistance(String word1, String word2) {
       int m=word1.length();
       int n=word2.length();
	 int ED[][] = new int[m + 1][n + 1];
 
       
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
               
                if (i == 0)
                    ED[i][j] = j; 
                
                else if (j == 0)
                    ED[i][j] = i; 
                else if (word1.charAt(i - 1)
                         == word2.charAt(j - 1))
                    ED[i][j] = ED[i - 1][j - 1];
 
                else
                    ED[i][j] = 1 + minimum(ED[i][j - 1],ED[i - 1][j], ED[i - 1][j - 1]); 
            }
        }
 
        return ED[m][n];
    }
    static int minimum(int a, int b, int c)
    {
        if (a <= b && a <= c)
            return a;
        if (b <= a && b <= c)
            return b;
        else
            return c;
    }
}