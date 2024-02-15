package main.java.grind75.week5;

public class P4MaxDepthBinaryTree {

    public static void main(String[] args) {
        System.out.println(maxDepth(null));
    }

    public static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
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
