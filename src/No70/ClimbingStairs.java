package No70;

/**
 * Created by bupt on 4/25/17.
 */
public class ClimbingStairs {
    public int climbStairs(int n){
        if(n < 3){
            if(n == 2)
                return 2;
            else
                return 1;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n] ;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(new ClimbingStairs().climbStairs(n));
    }
}
