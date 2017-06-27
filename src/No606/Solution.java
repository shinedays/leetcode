package No606;

import Structures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wang jf on 2017/6/16.
 */
public class Solution {
    public static String tree2str(TreeNode t){
        if( t == null)
            return "";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(t.val);

        if(t.left != null && t.right == null){
            stringBuffer.append("(").append(tree2str(t.left)).append(")");
        }
        else if(t.right != null){
            stringBuffer.append("(").append(tree2str(t.left)).append(")")
                    .append("(").append(tree2str(t.right)).append(")");
        }

        return stringBuffer.toString();
    }



    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);

        root.left = node1;
        root.right = node2;
        node1.right = node3;

        System.out.println(tree2str(root));

    }
}
