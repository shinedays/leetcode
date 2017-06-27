package No236;

import Structures.TreeNode;

/**
 * Created by Wang jf on 2017/6/23.
 * 递归，深度优先搜索，如果左右节点都找到目标节点了，则表示已经找到了最小公共祖先了，而且其上的公共节点必然左右子树不全为标记
 * 在发现目标节点或者为null时返回root
 * 否则递归寻找左右节点是否有目标节点
 * 若均不为空则表示当前点必定是最小祖先节点，返回
 * 如果结果有null则判断，优先返回非空的左子树结果
 *
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null)
            return root;
        return left == null ? right : left;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(0);
        TreeNode node6 = new TreeNode(8);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(4);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node4.left = node7;
        node4.right = node8;

        Solution s = new Solution();
        System.out.println(s.lowestCommonAncestor(root,node3,node8).val);
    }
}
