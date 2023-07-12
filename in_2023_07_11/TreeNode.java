package in_2023_07_11;

import java.util.ArrayList;

public class TreeNode {

    public Object data;
    public ArrayList<TreeNode> children;

    public TreeNode(Object data) {
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }

    // addChild() method with parameter TreeNode child
    public void addChild(TreeNode child) {
        this.children.add(child);
    }

    // addChild() method with parameter Object data
    public void addChild(Object childData) {
        TreeNode child = new TreeNode(childData);
        this.children.add(child);
    }

    // removeChild() with TreeNode parameter
    public void removeChild(TreeNode childToRemove) {
        if (this.children.isEmpty()) {
            return;
        } else if (this.children.contains(childToRemove)) {
            this.children.remove(childToRemove);
            return;
        } else {
            for (TreeNode child : this.children) {
                child.removeChild(childToRemove);
            }
        }
    }
}