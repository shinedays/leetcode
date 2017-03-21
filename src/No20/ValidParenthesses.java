package No20;

/**
 * Created by bupt on 3/21/17.
 */
public class ValidParenthesses {
    public boolean checkMatch(char ch1,char ch2){
        if(ch1 == '(' && ch2 == ')')
            return true;
        if(ch1 == '{' && ch2 == '}')
            return true;
        if(ch1 == '[' && ch2 == ']')
            return true;
        return false;
    }

    public boolean solution(String str){

        if(str.length() % 2 != 0){
            return false;
        }
        int low = 0;
        int high = str.length() - 1;
        while(low < high){
            if(checkMatch(str.charAt(low),str.charAt(low + 1))){
                low +=2;
                continue;
            } else if(checkMatch(str.charAt(high - 1),str.charAt(high))) {
                high -= 2;
                continue;
            } else if(checkMatch(str.charAt(low),str.charAt(high))){
                low ++;
                high --;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "{[]}()";
        System.out.println(new ValidParenthesses().solution(str));
    }
}
