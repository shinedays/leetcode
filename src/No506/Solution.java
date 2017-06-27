package No506;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Wang jf on 2017/6/21.
 */
public class Solution {
    public static String[] findRelativeRanks(int[] nums){
        Map<Integer,Integer> treeMap = new TreeMap<>((Integer o1, Integer o2) -> o2.compareTo(o1));
        for(int i = 0;i < nums.length;i++)
            treeMap.put(nums[i],i);
        String[] res = new String[nums.length];
        Integer index = 1;
        for(Map.Entry<Integer,Integer> entry : treeMap.entrySet()){
            res[entry.getValue()] = index.toString();
            index ++;
        }

        for(int i  = 0;i < res.length; i ++){
            switch (res[i]){
                case "1":res[i] = "Gold Medal";break;
                case "2":res[i] = "Silver Medal";break;
                case "3":res[i] = "Bronze Medal";break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {5,3,4,2,1,6};
        String[] res = findRelativeRanks(nums);
        for(String s: res)
            System.out.println(s);
    }
}
