package No461;

/**
 * Created by bupt on 6/8/17.
 */
public class Solution {
    public static int hammingDistance(int x,int y){
        int check = x^y;
        int res = Integer.bitCount(check);
        return  res;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        System.out.println(hammingDistance(x,y));
    }
}
