package No371;

/**
 * Created by Wang jf on 2017/6/16.
 */
public class Solution {
    public static int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(getSum(a,b));
    }
}
