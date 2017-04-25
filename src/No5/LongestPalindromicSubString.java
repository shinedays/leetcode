package No5;

/**
 * Created by bupt on 4/25/17.
 */
public class LongestPalindromicSubString {
    public String longestPalindrome(String s){
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        int start = 0;
        int maxLength = 0;

        for(int i = 0;i< length;i++){
            dp[i][i] = true;
            if(i < length -1 && s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                start = i;
                maxLength = 2;
            }
        }

        boolean flag = true;

        for(int strlen = 3;strlen <= length;strlen ++,flag = true){
            for(int i = 0;i<= length -strlen;i++){
                int j = i + strlen -1;
                if(dp[i+1][j-1] == true && s.charAt(i) == s.charAt(j)){
                    dp[i][j] = true;
                    maxLength = strlen;
                    if(flag == true){
                        start = i;
                        flag = false;
                    }

                }
            }
        }

        if(maxLength > 0)
            return s.substring(start,start + maxLength);

        return s.substring(0,1);
    }

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(new LongestPalindromicSubString().longestPalindrome(s));
    }
}
