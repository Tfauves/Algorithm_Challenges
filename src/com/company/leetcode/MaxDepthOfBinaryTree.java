package com.company.leetcode;

public class MaxDepthOfBinaryTree {
    public static void main(String[] args) {

    }

    public static class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
          this.right = right;
      }
  }

    static class Solution {
        public int maxDepth(TreeNode root) {
            int maxDepth = 0;
            maxNodes(root, maxDepth);

            return maxNodes(root, maxDepth);
        }

        public int maxNodes(TreeNode node, int sum) {

            if (node == null) {
                System.out.println(sum);
                return sum;
            }

            System.out.println(Math.max(maxNodes(node.left, sum + 1), maxNodes(node.right, sum + 1)));
            return Math.max(maxNodes(node.left, sum + 1), maxNodes(node.right, sum + 1));

        }
    }


}
