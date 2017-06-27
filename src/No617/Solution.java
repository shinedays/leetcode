package No617;

/**
 * Created by Wang jf on 2017/6/15.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public static void printInOrder(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            printInOrder(root.left);
            printInOrder(root.right);
        }
    }
}

public class Solution {
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return null;
        int val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
        TreeNode newNode = new TreeNode(val);
        newNode.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        newNode.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);

        return newNode;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(5);
        root1.left = node1;
        root1.right = node2;
        node1.left = node3;

        TreeNode root2 = new TreeNode(2);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        root2.left = node4;
        root2.right = node5;
        node4.right = node6;
        node5.right = node7;

        TreeNode newNode = mergeTrees(root1, root2);
        TreeNode.printInOrder(newNode);

    }
}
