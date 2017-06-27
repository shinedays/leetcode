package No566;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Wang jf on 2017/6/15.
 */
public class Solution {
    public static int[][] matrixResharp(int[][] nums,int r,int c){
        int rows = nums.length;
        int columns = nums[0].length;

        if(rows * columns != r*c)
            return nums;

        Queue<Integer> q = new LinkedList<>();

        for(int[] row : nums){
            for(int n : row){
                q.add(n);
            }
        }

        int[][] result = new int[r][c];

        for(int i = 0;i < r;i++){
            for(int j =0;j < c;j++){
                result[i][j] = q.poll();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] test = {{1,2},{3,4}};
        int[][] res = matrixResharp(test,1,4);
        for(int[] row : res){
            for(int n:row){
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
