public class Solution {
    public int longestPalindromeSubseq(String s) {
        int m = s.length();
        int n = s.length()-1;
        int[][] LPS = new int[m][m];
        
        for (int i = m - 1; i >= 0; i--) {
            LPS[i][i] = 1;
            for (int j = i+1; j < m; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    LPS[i][j] = LPS[i+1][j-1] + 2;
                } else {
                    LPS[i][j] = Math.max(LPS[i+1][j], LPS[i][j-1]);
                }
            }
        }
        return LPS[0][n];
    }
}