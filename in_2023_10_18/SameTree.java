/*
LEETCODE JAVA CHALLENGES: 100. Same Tree
Given the roots of two binary trees p and q, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

Example 1:
Input: p = [1,2,3], q = [1,2,3]
Output: true

Example 2:
Input: p = [1,2], q = [1,null,2]
Output: false

Example 3:
Input: p = [1,2,1], q = [1,1,2]
Output: false
 */

package in_2023_10_18;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // if both nodes are null, they're identical
        if (p == null && q == null) return true;

        // if one node is null but the other isn't, they're not identical
        if (p == null || q == null) return false;

        // if the values of the nodes are different, they're not identical
        if (p.val != q.val) return false;

        // recursively check the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        SameTree st = new SameTree();

        TreeNode tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode tree2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(st.isSameTree(tree1, tree2));  // Expected: true

        TreeNode tree3 = new TreeNode(1, new TreeNode(2), null);
        TreeNode tree4 = new TreeNode(1, null, new TreeNode(2));
        System.out.println(st.isSameTree(tree3, tree4));  // Expected: false

        TreeNode tree5 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode tree6 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        System.out.println(st.isSameTree(tree5, tree6));  // Expected: false
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {this.val = val; this.left = left; this.right = right;}
    }
}
