/* LEETCODE JAVA CHALLENGES: 101. Symmetric Tree

Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
Example 1:
Input: root = [1,2,2,3,4,4,3]
Output: true

Example 2:
Input: root = [1,2,2,null,3,null,3]
Output: false
 */

package in_2023_10_18;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
            return isMirror(root.left, root.right);
        }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        // Base cases
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;

        // Node value check
        if (t1.val != t2.val) return false;

        // Recursive case
        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }

        // TreeNode inner class for clarity
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

    public static void main(String[] args) {
        SymmetricTree st = new SymmetricTree();

        // Test Case 1: Symmetric tree
        TreeNode tree1 = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3))
        );
        System.out.println(st.isSymmetric(tree1));  // Expected: true

        // Test Case 2: Not symmetric
        TreeNode tree2 = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3))
        );
        System.out.println(st.isSymmetric(tree2));  // Expected: false

        // Additional Test Case: A single node tree (always symmetric)
        TreeNode tree3 = new TreeNode(1);
        System.out.println(st.isSymmetric(tree3));  // Expected: true
    }
}


