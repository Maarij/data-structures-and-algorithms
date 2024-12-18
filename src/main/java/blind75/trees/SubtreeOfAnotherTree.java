package main.java.blind75.trees;

/**
 * <a href="https://leetcode.com/problems/subtree-of-another-tree/description/">572. Subtree of Another Tree</a>
 * <br>
 * <br>
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 */
public class SubtreeOfAnotherTree {
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(2);

        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;

        System.out.println(isSubtree(node1, node4));

    }

    // TC: O(r*s)
    private static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (sameTree(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private static boolean sameTree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }

        if (root != null && subRoot != null && root.val == subRoot.val) {
            return sameTree(root.left, subRoot.left) && sameTree(root.right, subRoot.right);
        }

        return false; // One tree is null
    }
}
