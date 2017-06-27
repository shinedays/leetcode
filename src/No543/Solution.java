package No543;

import Structures.TreeNode;

/**
 * Created by Wang jf on 2017/6/22.
 */
public class Solution {
    private static int max = 0;
    public static int diameterOfBinaryTree(TreeNode root){
        maxDitance(root);
        return max;
    }

    public static int maxDitance(TreeNode root){
        if(root == null)
            return 0;
        int left = maxDitance(root.left);
        int right = maxDitance(root.right);
        max = Math.max(max, left + right);
        return Math.max(left,right) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;

        System.out.println(diameterOfBinaryTree(root));

    }
}
