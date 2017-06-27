package No563;

import Structures.TreeNode;

import java.net.Socket;

/**
 * Created by Wang jf on 2017/6/20.
 */
public class Solution {
    private int sum = 0;
    public int findTilt(TreeNode root){
        sum(root);
        return sum;
    }

    public int sum(TreeNode root){
        if(root == null)
            return 0;
        int left = sum(root.left);
        int right = sum(root.right);
        int res = Math.abs(left - right);
        sum += res;
        return root.val + left + right;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(8);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node2.right = node4;

        System.out.println(s.findTilt(root));
    }
}
