package No222;

import Structures.TreeNode;

/**
 * Created by Wang jf on 2017/6/23.
 * 采用递归方式，分别看左右子树深度，若一样表明是完全二叉树，使用2^h -1计算节点数
 * 若左右不一致则分别向左右子树递归，返回1 + 左递归 + 右递归
 * 其中为了不超时使用移位而不是Math.pow,注意-的优先级高于<<，故需要括号，否则会出错
 */
public class Solution {
    public static int countNodes(TreeNode root){
        if(root == null)
            return 0;
        int maxLeft = 1;
        int maxRight = 1;
        TreeNode temp = root;
        while(temp.left != null){
            maxLeft ++;
            temp = temp.left;
        }
        temp = root;
        while (temp.right != null){
            maxRight ++;
            temp = temp.right;
        }
        if(maxLeft == maxRight)
            return (1 << maxLeft) - 1;

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(8);
        TreeNode node8 = new TreeNode(9);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node3.left = node7;
        node3.right = node8;

        System.out.println(countNodes(root));
        System.out.println(1 << 2);

    }
}
