import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int l1 = g.length;
        int l2 = s.length;
        int i = 0;
        int j = 0;
        while (j < l2 && i < l1) {
            if (s[j] >= g[i]) {
                i++;
                j++;
                continue;
            } else {
                j++;
            }

        }
        return i;
    }
}