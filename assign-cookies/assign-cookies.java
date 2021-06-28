class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int t = 0;
        int x = 0;
        int y = 0;
        while( x < g.length && y < s.length){
            if( g[x]<=s[y] ){
                x=x+1;
                y=y+1;
                t=t+1;
            } else{
                y=y+1;
            }
        }
        return t;

    }

}