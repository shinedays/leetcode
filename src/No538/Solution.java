package No538;

import Structures.TreeNode;

/**
 * Created by Wang jf on 2017/6/22.
 * 采用倒置的中序遍历实现由大到小的排列，右中左遍历
 * 将前面遍历的值做累加和
 * 将当前节点数值加上sum后修改sum
 * 最终到最左即最小节点时完成遍历
 */
public class Solution {
    int sum = 0;
    public TreeNode convertBST(TreeNode root){
        convert(root);
        return root;
    }

    public void convert(TreeNode node){
        if(node == null)
            return;
        convert(node.right);
        node.val += sum;
        sum  = node.val;
        convert(node.left);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(13);
        root.left = node1;
        root.right = node2;

        TreeNode rootNew = s.convertBST(root);
        System.out.println(rootNew.val + " " + rootNew.left.val);
    }
}
