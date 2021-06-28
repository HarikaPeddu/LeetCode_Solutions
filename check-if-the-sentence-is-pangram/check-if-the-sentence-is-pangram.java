class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] m = new boolean[100];
        int pos = 0;
        int n = sentence.length();
        for (int x = 0; x < n; x++) {
            int s = sentence.charAt(x);
            if ('a' <= s && s <= 'z')
                pos = s - 'a';
            else
                continue;
            m[pos] = true;
        }
        for (int x = 0; x <= 25; x++)
            if (m[x] == false)
                return (false);
        return(true);
    }
}