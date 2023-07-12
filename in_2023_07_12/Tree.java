package in_2023_07_12;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public TreeNode root;

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void print() {
        print(this.root, 0);
    }

    public void print(TreeNode current, int level) {
        String levelMarks = "";
        for (int i = 0; i < level; i++) {
            levelMarks += "-- ";
        }
        System.out.println(levelMarks + current.data);
        for (TreeNode child : current.children) {
            print(child, level + 1);
        }
    }
    // define depthFirstTraversal
    public void depthFirstTraversal(TreeNode current) {
        System.out.print(current.data + " ");
        for (TreeNode child : current.children) {
            depthFirstTraversal(child);
        }
    }
    // define breadthFirstTraversal
    public void breadthFirstTraversal() {
        TreeNode current = this.root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(current);
        while (!queue.isEmpty()) {
            current = queue.poll();
            System.out.print(current.data + " ");
            queue.addAll(current.children);
        }

    }

    public static void main(String[] args) {
        TreeNode treeRoot = new TreeNode("S");
        TreeNode child1 = new TreeNode("N");
        TreeNode child2 = new TreeNode("O");
        TreeNode grandchild1 = new TreeNode("W");
        TreeNode grandchild2 = new TreeNode("Y");
        // addChild operations below
        treeRoot.addChild(child1);
        treeRoot.addChild(child2);
        child1.addChild(grandchild1);
        child2.addChild(grandchild2);
        // Create tree
        Tree tree = new Tree(treeRoot);
        // Print tree
        tree.print();

        // Remove grandchild2 from the tree
        treeRoot.removeChild(grandchild2);

        // Print the tree
        tree.print();

        // Remove "O" from the tree
        treeRoot.removeChild("O");

        // Print the tree again
        tree.print();

        // Call depthFirstTraversal (first restore the previous tree state)
        treeRoot.addChild(child2);
        child2.addChild(grandchild2);
        System.out.println("\nDepth First Traversal");
        tree.depthFirstTraversal(treeRoot);

        // Call breadthFirstTraversal

        System.out.println("\n\nBreadth First Traversal");
        tree.breadthFirstTraversal();


        // ANOTHER TREE EXAMPLE / EXERCISE
        TreeNode animals = new TreeNode("Animals");
        TreeNode reptile = new TreeNode("Reptiles");
        TreeNode mammals = new TreeNode("Mammals");
        animals.addChild(reptile);
        animals.addChild(mammals);
        reptile.addChild("Lizard");
        reptile.addChild("Snake");
        TreeNode equine = new TreeNode("Equine");
        TreeNode bovine = new TreeNode("Bovine");
        TreeNode marsupial = new TreeNode("Marsupial");
        mammals.addChild(equine);
        mammals.addChild(bovine);
        mammals.addChild(marsupial);
        equine.addChild("Horse");
        equine.addChild("Zebra");
        bovine.addChild("Husky");
        marsupial.addChild("Koala");

        Tree animalTree = new Tree(animals);

        // Add and remove accordingly
        animals.removeChild("Husky");
        bovine.addChild("Cow");
        marsupial.addChild("Kangaroo");


        System.out.println("\n");
        animalTree.print();

        System.out.println("Printing DFS Traversal:");
        // Depth-first traversal
        animalTree.depthFirstTraversal(animals);


        System.out.println("");
        System.out.println("Printing BFS Traversal:");
        // Breadth-first traversal
        animalTree.breadthFirstTraversal();
    }
}