package main.java.grind75.week3;


public class P1BalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);

        node3.left = node9;
        node3.right = node20;
        node20.left = node15;
        node20.right = node7;

        System.out.println(isBalanced(node3) > -1);
    }

    private static int isBalanced(TreeNode root) {
        if (root == null)
            return 0;

        int leftSide = isBalanced(root.left);
        if (leftSide == -1) return -1;

        int rightSide = isBalanced(root.right);
        if (rightSide == -1) return -1;

        if (Math.abs(leftSide - rightSide) > 1)
            return -1;
        else
            return Math.max(leftSide, rightSide) + 1;
    }

    public static class TreeNode {
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
}
