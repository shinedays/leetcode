package No344;

/**
 * Created by Wang jf on 2017/6/15.
 */
public class Solution {
    public static String reverseString(String s){
        if(s == null)
            return "";
        StringBuffer stringBuffer = new StringBuffer(s);
        stringBuffer.reverse();
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverseString(s));
    }
}
