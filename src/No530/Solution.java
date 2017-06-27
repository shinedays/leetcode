package No530;

import Structures.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Wang jf on 2017/6/19.
 */
public class Solution {
    public static void inOrder(TreeNode root, List<Integer> list){
        if(root != null) {
            inOrder(root.left, list);
            list.add(root.val);
            inOrder(root.right, list);
        }
    }

    public static int getMinimumDifference(TreeNode root){
        List<Integer> list = new ArrayList<>();
        inOrder(root,list);
        int min = Integer.MAX_VALUE;
        if(list.size() == 1)
            return list.get(0);
        for(int i = 1;i < list.size();i++){
            if(min > list.get(i) - list.get(i - 1))
                min = list.get(i) - list.get(i - 1);
        }
        System.out.println(list);
        return min;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(4);
        root.left = node1;
        root.right = node2;

        System.out.println(getMinimumDifference(root));
    }
}
