package No561;

/**
 * Created by bupt on 6/8/17.
 */
public class Solution {
    public static void partation(int[] array, int begin, int end) {
        if (begin >= end)
            return;
        int index = array[begin];
        int i = begin;
        int j = end;

        while (i < j) {
            while (i < j && array[j] >= index)
                j--;

            if (i < j)
                array[i++] = array[j];

            while (i < j && array[i] < index)
                i++;
            if (i < j)
                array[j--] = array[i];
        }

        array[i] = index;
        partation(array, begin, i - 1);
        partation(array, i + 1, end);

    }

    public static void quickSort(int[] array) {
        partation(array, 0, array.length - 1);
        for(int n:array){
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static int arrayPairSum(int[] nums) {
        if (nums == null) {
            return 0;
        }
        quickSort(nums);
        int res = 0;
        for (int i = 0; i < nums.length - 1; i = i + 2)
            res += nums[i];
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,5,2,3,8};
        System.out.println(arrayPairSum(nums));
    }

}
