package No485;

/**
 * Created by Wang jf on 2017/6/15.
 */
public class Solution {
    public static int findMaxConsecutiveOnes(int[] nums){
        boolean firstOne = true;
        int begin = 0;
        int end = 0;
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            if(firstOne == true && nums[i] == 1){
                begin = i;
                firstOne = false;
                continue;
            } else if(firstOne == false && nums[i] == 0){
                end = i;
                firstOne = true;
                max = max > end - begin ? max : end - begin;
                continue;
            }
        }
        if(begin >= end && nums[begin] == 1){
            max = max > nums.length -begin ? max : nums.length - begin;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
