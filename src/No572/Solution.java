package No572;

import Structures.TreeNode;

/**
 * Created by Wang jf on 2017/6/22.
 * 先序遍历，将空的子节点置为#，每个节点由$包围
 * 之后通过比较一个是否是另一个的子串判定
 *
 */
public class Solution {
    public static boolean isSubtree(TreeNode s, TreeNode t){
        StringBuffer spre = new StringBuffer();
        StringBuffer tpre = new StringBuffer();
        preOrder(s,spre.append("$"));
        preOrder(t,tpre.append("$"));
        System.out.println(spre);
        System.out.println(tpre);
        return spre.toString().contains(tpre.toString());
    }

    public static void preOrder(TreeNode root, StringBuffer str){
        if(root == null){
            str.append("#$");
            return;
        }

        str.append(root.val).append("$");
        preOrder(root.left,str);
        preOrder(root.right,str);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(5);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(0);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node4.left = node5;

        TreeNode tRoot = new TreeNode(4);
        TreeNode tNode1 = new TreeNode(1);
        TreeNode tNode2 = new TreeNode(2);
        tRoot.left = tNode1;
        tRoot.right = tNode2;

        System.out.println(isSubtree(root,tRoot));

    }
}
