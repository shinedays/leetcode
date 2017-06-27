package No453;

/**
 * Created by Wang jf on 2017/6/20.
 */
public class Solution {
    /*
    解题方法很巧妙，n-1的数加一相当于有一个数减一，那么就转化为所有数字到最小数
    的步数之和。步骤即找到最小值，逐个计算差值并相加。
     */

    public static int minMoves(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int num :nums)
            if(num < min)
                min = num;
        int res = 0;
        for(int num : nums)
            res += num - min;
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(minMoves(nums));
    }
}
