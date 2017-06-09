package No557;

import java.util.Stack;

/**
 * Created by bupt on 6/9/17.
 */
public class Solution {
    public static String reverseWords(String s) {
        if (s == null)
            return null;
        StringBuffer res = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                stack.push(c);
            else {
                while (!stack.isEmpty()) {
                    char character = stack.pop();
                    res.append(character);
                }
                res.append(" ");
            }
        }

        while (!stack.isEmpty()) {
            char character = stack.pop();
            res.append(character);
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
