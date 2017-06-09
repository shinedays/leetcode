package No123;

import java.util.Map;

/**
 * Created by bupt on 4/25/17.
 */
public class BestTimeToBuyIII {
    public int maxProfit(int[] prices){
        int length = prices.length;
        if(length < 2)
            return 0;
        int[] preProfit = new int[length];
        int[] postProfit = new int[length];

        int min = prices[0];

        for(int i = 1;i< length;i++){
            min = Math.min(min,prices[i]);
            preProfit[i] = Math.max(preProfit[i -1],prices[i] - min);
        }

        int max = prices[length - 1];

        for(int i  = length -2;i >= 0; i --){
            max = Math.max(max,prices[i]);
            postProfit[i] = Math.min(postProfit[i+1],prices[i] - max);
        }

        int res = 0;
        for(int i = 0;i < length;i++){
            res = Math.max(res,preProfit[i] + postProfit[i]);
        }

        return res;
    }


    public static void main(String[] args) {
        int[] prices = {2,1,2,0,1};
        System.out.println(new BestTimeToBuyIII().maxProfit(prices));
    }
}
