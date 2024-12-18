package main.java.blind75.trees;

/**
 * <a href="https://leetcode.com/problems/invert-binary-tree/description/">226. Invert Binary Tree</a>
 * <br>
 * <br>
 * Given the root of a binary tree, invert the tree, and return its root.
 */
public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        node1.left = node2;
        node1.right = node3;

        invertTree(node1);
    }

    // TC: o(n)
    // SC: o(n)
    private static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}


