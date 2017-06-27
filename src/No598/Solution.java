package No598;

/**
 * Created by Wang jf on 2017/6/19.
 */
public class Solution {
    public static int maxCount(int m, int n, int[][] ops) {
        int[] max = new int[2];

        if(ops.length == 0){
            return  m*n;
        }

        for(int[] op : ops){
            if(max[0] == 0 && max[1] == 0){
                max[0] = op[0];
                max[1] = op[1];
            }
            if(max[0] > op[0])
                max[0] = op[0];
            if(max[1] > op[1])
                max[1] = op[1];
        }

        if(max[0] > m)
            max[0] = m;
        if(max[1] > n)
            max[1] = n;

        int res = max[0] * max[1];
        return res;
    }

    public static void main(String[] args) {
        int[][] ops = {{2,2},{3,3}};
        System.out.println(maxCount(1,1,ops));
    }

}
