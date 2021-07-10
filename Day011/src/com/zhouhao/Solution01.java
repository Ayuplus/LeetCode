package com.zhouhao;

/**
 * 二叉树镜像
 * @author wangzhouhao
 * @date 2021/6/27
 */
@SuppressWarnings("all")
public class Solution01 {
    public TreeNode mirrorTree(TreeNode root) {
        if ( root==null )
            return root;
        if (root.left != null || root.right != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            mirrorTree(root.left);
            mirrorTree(root.right);
        }
        return root;
    }
}

