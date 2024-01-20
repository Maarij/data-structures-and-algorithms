package main.java.grind75.week2;

/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
 */
public class P5LowestCommonAncestorBinaryTree {
    public static void main(String[] args) {
        TreeNode six = new TreeNode(6);
        TreeNode two = new TreeNode(2);
        TreeNode eight = new TreeNode(8);
        TreeNode zero = new TreeNode(0);
        TreeNode four = new TreeNode(4);
        TreeNode three = new TreeNode(3);
        TreeNode five = new TreeNode(5);
        TreeNode seven = new TreeNode(7);
        TreeNode nine = new TreeNode(9);

        six.left = two;
        six.right = eight;

        two.left = zero;
        two.right = four;

        four.left = three;
        four.right = five;

        eight.left = seven;
        eight.right = nine;

        TreeNode lca = lowestCommonAncestor(six, three, five);
        if (lca != null)
            System.out.println(lca.val);
    }

    private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;

        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

    private static TreeNode lowestCommonAncestorIterative(TreeNode root, TreeNode p, TreeNode q) {
        int small = Math.min(p.val, q.val);
        int large = Math.max(p.val, q.val);

        while (root != null) {
            if (root.val > large)
                root = root.left;
            else if (root.val < small)
                root = root.right;
            else
                return root;
        }
        return null;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
