package com.zhouhao;

/**
 * @author wangzhouhao
 * @date 2021/6/27
 */
public class Solution02 {
    public int maxDepth(TreeNode root) {
        if ( root == null ){
            return 0;
        }
        return Math.max( root.left == null ? 0 : maxDepth(root.left) , root.right == null ? 0 : maxDepth(root.right) ) + 1;
    }
}
