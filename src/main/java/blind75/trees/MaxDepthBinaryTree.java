package main.java.blind75.trees;

/**
 * <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/description/">104. Maximum Depth of Binary Tree</a>
 * <br>
 * <br>
 * Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the
 * longest path from the root node down to the farthest leaf node.
 */
public class MaxDepthBinaryTree {
    public static void main(String[] args) {
        System.out.println(maxDepth(null));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}


