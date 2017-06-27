package No349;

import java.util.*;

/**
 * Created by Wang jf on 2017/6/20.
 */
public class Solution {
    public static int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> num1 = new HashSet<>();
        Set<Integer> num2 = new HashSet<>();
        for(int n1 : nums1)
            num1.add(n1);
        for(int n2 : nums2)
            num2.add(n2);

        List<Integer> list = new ArrayList<>();

        for(int s2: num2){
            if(num1.contains(s2))
                list.add(s2);
        }

        int[] res = new int[list.size()];
        for(int i = 0;i < list.size();i++){
            res[i] = list.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {};

        int[] res = intersection(nums1,nums2);
        for(int n:res)
            System.out.println(n);
    }
}
