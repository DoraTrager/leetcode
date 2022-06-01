package leetcodeproblems.LC_201_300;

import datastructures.TreeNode;

//235. [Lowest Common Ancestor of a Binary Search Tree]
// (https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree)
public class S_235_LowestCommonAncestorOfBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null) {
            return root;
        }

        return left == null? right: left;
    }
}
