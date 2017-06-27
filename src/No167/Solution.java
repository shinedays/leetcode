package No167;

/**
 * Created by Wang jf on 2017/6/19.
 */
public class Solution {
    public static int[] twoSum(int[] numbers,int target){
        int low = 0;
        int high = numbers.length - 1;
        while(low < high){
            int res = numbers[low] + numbers[high];
            if(res > target){
                high --;
            }
            if(res < target){
                low ++;
            }
            if(res == target)
                break;
        }
        int[] result = new int[2];
        result[0] = low + 1;
        result[1] = high + 1;
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target  = 9;
        int[] res  = twoSum(numbers,target);
        for(int n:res)
            System.out.println(n);
    }
}
