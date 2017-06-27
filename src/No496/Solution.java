package No496;

import java.util.*;

/**
 * Created by Wang jf on 2017/6/15.
 */
public class Solution {
    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty()) {
                    if (stack.peek() < num) {
                        map.put(stack.peek(), num);
                        stack.pop();
                    } else
                        break;
                }
            }
            stack.push(num);
        }
        while (!stack.isEmpty()) {
            int num = stack.pop();
            map.put(num, -1);
        }

        int[] result = new int[findNums.length];
        for (int i = 0; i < findNums.length; i++) {
            result[i] = map.get(findNums[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 3, 5, 2, 4};
        int[] num2 = {6, 5, 4, 3, 2, 1, 7};
        int[] res = nextGreaterElement(num1, num2);
        for (int num : res)
            System.out.println(num);
    }
}
