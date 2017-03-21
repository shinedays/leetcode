package No20;

import java.util.Stack;

/**
 * Created by bupt on 3/21/17.
 */
public class ValidParenthesses {

    public boolean solution(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i< s.length();i++){
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == ')'){
                if(!stack.empty() && stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            }

            if(s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == ']'){
                if(!stack.empty() && stack.peek() == '[')
                    stack.pop();
                else
                    return false;
            }
            if(s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == '}'){
                if(!stack.empty() && stack.peek() == '{')
                    stack.pop();
                else
                    return false;
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "";
        System.out.println(new ValidParenthesses().solution(str));
    }
}
