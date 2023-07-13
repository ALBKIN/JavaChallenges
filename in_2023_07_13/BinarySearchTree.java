package in_2023_07_13;

public class BinarySearchTree {

    public int value;
    public int depth;
    public BinarySearchTree left;
    public BinarySearchTree right;

    // Constructor
    public BinarySearchTree(int value, int depth) {
        this.value = value;
        this.depth = depth;
        this.left = null;
        this.right = null;
    }

    // Constructor for root Node of BST
    public BinarySearchTree(int value) {
        this.value = value;
        this.depth = 1;
        this.left = null;
        this.right = null;
    }

    // Insert method
    public void insert(int value) {
        if (value < this.value) {
            if (this.left == null) {
                this.left = new BinarySearchTree(value, this.depth + 1);
                System.out.printf("Tree node %d added to the left of %d at depth %d \n", value, this.value, this.depth + 1);
            } else {
                this.left.insert(value);
            }
        } else if (value > this.value) {
            if (this.right == null) {
                this.right = new BinarySearchTree(value, this.depth + 1);
                System.out.printf("Tree node %d added to the right of %d at depth %d \n", value, this.value, this.depth + 1);
            } else {
                this.right.insert(value);
            }
        }
    }

    // Get Node by Value method
    public BinarySearchTree getNodeByValue(int value) {
        if (value == this.value) {
            return this;
        } else if (value < this.value && left != null) {
            return left.getNodeByValue(value);
        } else if (value > this.value && right != null) {
            return right.getNodeByValue(value);
        }
        return null;
    }

    // DEPTH FIRST TRAVERSAL METHOD: INORDER
    public void depthFirstTraversal() {
        if (this.left != null) {
            this.left.depthFirstTraversal();
        }
        System.out.println(this.value);
        if (this.right != null) {
            this.right.depthFirstTraversal();
        }
    }

    public static void main(String[] args) {
        // Create a new BST:
        BinarySearchTree bt = new BinarySearchTree(15);
        // Print bt's value below:
        System.out.println(bt.value);

        // test getNodeByValue
        BinarySearchTree root = new BinarySearchTree(100);
        root.insert(50);
        root.insert(125);
        root.insert(75);
        root.insert(25);

        System.out.println(root.getNodeByValue(75));
        System.out.println(root.getNodeByValue(55));

        // test depthfirstTraversal
        System.out.println("\nCreating Binary Search Tree rooted at value 15:");
        BinarySearchTree tree = new BinarySearchTree(19);

        for (int i = 0; i < 10; i++) {
            tree.insert((int) (Math.random() * 100));
        }

        // Print depth-first traversal
        System.out.println("Printing the inorder depth-first traversal");
        tree.depthFirstTraversal();



    }
}