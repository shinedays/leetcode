package No257;

import Structures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wang jf on 2017/6/23.
 */
public class Solution {
    List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root){
        findPath(root,String.valueOf(root.val));
        return res;
    }

    public void findPath(TreeNode node, String path){
        if(node.left == null && node.right == null)
            res.add(path);
        if(node.left != null)
            findPath(node.left,path + "->" + node.left.val);
        if(node.right != null)
            findPath(node.right,path + "->" + node.right.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(5);
        root.left = node1;
        root.right = node2;
        node1.right = node3;

        Solution s = new Solution();
        System.out.println(s.binaryTreePaths(root));
    }
}
