package No575;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wang jf on 2017/6/15.
 */
public class Solution {
    public static int distributeCandies(int[] candies){
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : candies){
            if(map.containsKey(n))
                map.put(n,map.get(n) + 1);
            else
                map.put(n,1);
        }
        int candyKind = candies.length;
        if(map.size() > candyKind /2)
            return candyKind /2;
        else
            return map.size();
    }

    public static void main(String[] args) {
        int[] candies = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candies));
    }
}
