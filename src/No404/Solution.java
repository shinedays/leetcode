package No404;

import Structures.TreeNode;

/**
 * Created by Wang jf on 2017/6/20.
 */
public class Solution {

    /*
    采用递归的方式，如果左节点是叶子结点
     */
    public static int sumOfLeftLeaves(TreeNode root){
        if(root == null)
            return 0;
        if(root.left != null && root.left.left == null && root.left.right == null)
            return root.left.val + sumOfLeftLeaves(root.right);
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        System.out.println(sumOfLeftLeaves(root));

    }
}
