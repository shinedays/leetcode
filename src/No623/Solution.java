package No623;

import Structures.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Created by Wang jf on 2017/6/21.
 * 思路：使用BFS，记录下当前个节点的层数，然后遍历节点层数对应的map选取相应层数进行插入，考虑层数为1的特殊情况
 */
public class Solution {

    public static TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode newRoot = new TreeNode(v);
            newRoot.left = root;
            return newRoot;
        }

        Map<TreeNode, Integer> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        map.put(root, 1);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            int dit = map.get(temp) + 1;
            if (temp.left != null) {
                queue.add(temp.left);
                map.put(temp.left, dit);
            }
            if (temp.right != null) {
                queue.add(temp.right);
                map.put(temp.right, dit);
            }
        }

        for (Map.Entry<TreeNode, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value == d - 1) {
                TreeNode node = entry.getKey();
                addNode(node, v);
            }
        }

        return root;
    }

    public static void addNode(TreeNode node, int val) {
        TreeNode left = new TreeNode(val);
        TreeNode right = new TreeNode(val);
        if (node.left != null)
            left.left = node.left;

        if (node.right != null)
            right.right = node.right;
        node.left = left;
        node.right = right;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(5);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;

        addOneRow(root, 1, 1);
        System.out.println();

    }
}
