package No389;

/**
 * Created by Wang jf on 2017/6/16.
 */
public class Solution {
    public static char findTheDifference(String s,String t){
        char res = 0x00;
        for(int i = 0;i<s.length();i++){
            res ^= s.charAt(i);
        }
        for(int i = 0;i<t.length();i++){
            res ^= t.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));
    }
}
