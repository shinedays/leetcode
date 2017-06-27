package No283;

/**
 * Created by Wang jf on 2017/6/16.
 */
public class Solution {
    public static void moveZeros(int[] nums){
        int current = 0;
        for(int i = 0;i < nums.length; i ++){
            if(nums[i] != 0){
                nums[current] = nums[i];
                current ++;
            }
        }
        for(int i = current; i < nums.length; i++)
            nums[i] = 0;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,0,2,3};
        moveZeros(nums);
        for(int num:nums)
            System.out.println(num);
    }
}
