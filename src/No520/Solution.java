package No520;

/**
 * Created by Wang jf on 2017/6/16.
 */
public class Solution {
    public static boolean detectCapitalUse(String word){
        String test1 = word.toLowerCase();
        String test2 = word.toUpperCase();
        if(test1.equals(word) || test2.equals(word))
            return true;
        if(word.length() > 1){
            if(word.charAt(0) <= 'Z' || word.charAt(0) >= 'A'){
                String test3 = word.substring(1).toLowerCase();
                if(test3.equals(word.substring(1)))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String input = "Aaogle";
        System.out.println(detectCapitalUse(input));
    }
}
