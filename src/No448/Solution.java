package No448;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wang jf on 2017/6/16.
 */
public class Solution {
    public static List<Integer> findDisapperedNumbers(int[] nums){
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i < n;i++){
            nums[(nums[i] - 1)%n] += n;
        }

        for(int i = 0; i < n; i ++){
            if(nums[i] <= n)
                res.add(i + 1);
        }
        return res;
    }

    public static List<Integer> findDisapperedNumbers2(int[] nums){
        List<Integer> res = new ArrayList<>();
        if(nums == null ||nums.length == 0)
            return res;
        for(int i = 0; i < nums.length; i ++){
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0)
                nums[val] = -nums[val];
        }

        for(int i = 0;i < nums.length;i++){
            if(nums[i] > 0)
                res.add(i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,3,2,7,8,2,3,1};
        int[] nums2 = {4,3,2,7,8,2,3,1};
        System.out.println(findDisapperedNumbers(nums1));
        System.out.println(findDisapperedNumbers2(nums2));
    }
}
