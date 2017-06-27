package No337;

import Structures.TreeNode;

/**
 * Created by Wang jf on 2017/6/22.
 * 最开始考虑层序遍历，隔行相加，发现出现了错误，形如[4,1,null,2,null,3]的隔层相加并非最优解
 * 查阅有更为简洁和易于理解的写法。采用递归，将情况分为用该点和不用该点，将结果记录在数组中
 * 其中res[0]记录不使用该点时的结果，res[1]记录使用该点的情况
 * 当点为空是返回res[0]，res[1]均为0。
 * 不为空时分两种情况，用该点和不用该点，不用该点时孩子节点是否采用不影响，找最大和相加即可求出新res[0]。
 * 用该点时孩子节点必须不能使用，所有为当前节点值加上俩孩子节点的res[0]，从而求出新res[1].
 * 递归至root结束
 */
public class Solution {
    public static int rob(TreeNode root){
        int[] res = subRob(root);
        return Math.max(res[0],res[1]);
    }

    public static int[] subRob(TreeNode node){
        if(node == null)
            return new int[2];
        int[] left = subRob(node.left);
        int[] right = subRob(node.right);

        int[] res = new int[2];
        res[0] = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);
        res[1] = node.val + left[0] + right[0];
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(1);

        root.left = node1;
        root.right = node2;
        node1.right = node3;
        node2.right = node4;

        System.out.println(rob(root));
    }
}
