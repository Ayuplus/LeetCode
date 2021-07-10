package com.zhouhao;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzhouhao
 * @date 2021/6/15
 */
public class Solution04 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if( root == null ){
            return list;
        }
        if( root.left == null && root.right== null ){
            list.add(root.val);
            return list;
        }
        if (root.left != null){
            list.addAll(inorderTraversal(root.left));
        }
        list.add(root.val);
        if ( root.right != null ){
            list.addAll(inorderTraversal(root.right));
        }
        return list;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
