package com.karthickgj;

public class MaxNodeValue {
    int tilt;
    public int max(TreeNode node) {

        if(node == null) {
            return Integer.MIN_VALUE;
        }

        int lMax = max(node.left);
        int rMax = max(node.right);
        return Math.max(lMax, Math.max(rMax, node.val));
    }

    public Integer dfs(TreeNode root) {
        if(root == null) {
            return 0;
        }

        if(root.left == null && root.right == null) {
            return root.val;
        }

        int leftSum = dfs(root.left);
        int rigtSum = dfs(root.right);
        tilt = tilt + Math.abs(leftSum - rigtSum);
        return leftSum + rigtSum + root.val;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        // Constructor to initialize the node with a value
        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
}
