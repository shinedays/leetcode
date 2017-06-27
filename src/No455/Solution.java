package No455;

import java.util.Arrays;

/**
 * Created by Wang jf on 2017/6/20.
 */
public class Solution {
    public static int findContentChildren(int[] g, int[] s){
        if(g == null || g.length == 0 || s == null || s.length == 0)
            return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int childIndex = 0;
        for(int cookie : s){
            if(childIndex >= g.length)
                break;
            if(cookie >= g[childIndex]){
                res ++;
                childIndex ++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] g = {2,1,3};
        int[] s = {1,2,2};
        System.out.println(findContentChildren(g,s));
    }
}
