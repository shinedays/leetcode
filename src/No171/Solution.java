package No171;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wang jf on 2017/6/21.
 */
public class Solution {
    public static int titleToNumber(String s){
        Map<String, Integer> compare = new HashMap<>();
        char start = 'A';
        for(int i = 1; i <= 26; i ++){
            compare.put(String.valueOf((char)(start + i - 1)),i);
        }
        int res = 0;
        for(int i = 0;i < s.length(); i ++){
            double test = Math.pow(26,s.length() - i - 1);
            int res1 = (int)test*compare.get(String.valueOf(s.charAt(i)));
            res += res1;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "AB";
        String s2 = String.valueOf((char)(s.charAt(0) + 1));
        System.out.println(s2);
        Math.pow(26,0);
        System.out.println(titleToNumber(s));
    }
}
