package No104;

import Structures.TreeNode;

/**
 * Created by Wang jf on 2017/6/16.
 */
public class Solution {
    public int maxDepth(TreeNode root){
        if(root == null)
            return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}
