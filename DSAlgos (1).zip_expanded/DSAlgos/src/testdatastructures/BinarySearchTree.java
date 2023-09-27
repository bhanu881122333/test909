package testdatastructures;

public class BinarySearchTree {

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    Node root;

    public void insert(int value) {
        root = insertNode(root, value);
    }

    public Node insertNode(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.value) {
            root.left = insertNode(root.left, value);
        } else if (value > root.value) {
            root.right = insertNode(root.right, value);
        }
        return root;
    }

    public void sortedOrder(Node root) {
        transverseOrder(root);
    }

    public void transverseOrder(Node root) {
        if (root != null) {
            transverseOrder(root.left);
            System.out.println(root.value);
            transverseOrder(root.right);
        }
    }

    public Node minelement() {
        return findminimumelement(root);
    }

    public Node findminimumelement(Node root) {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }
    
    public Node maxelement() {
        return findmaxelement(root);
    }

    public Node findmaxelement(Node root) {
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }
    
    public int getheight() {
        return height(root);
    }
    
    public int height(Node root) {
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
    
    public boolean searchele(int value) {
        return searchelement(root, value);
    }
    
    public boolean searchelement(Node root, int value) {
        if (root == null) {
            return false;
        }
        if (value == root.value) {
            return true;
        }
        if (value < root.value) {
            return searchelement(root.left, value);
        } else {
            return searchelement(root.right, value);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(4);
        tree.insert(6);
        tree.insert(12);
        tree.insert(7);
        tree.insert(14);
        tree.insert(2);
        tree.insert(17);
        tree.sortedOrder(tree.root);

        Node minNode = tree.minelement();
        System.out.println("Minimum Element: " + minNode.value);
        
        Node maxNode = tree.maxelement();
        System.out.println("Maximum Element: " + maxNode.value);
        
        System.out.println("Height is " + tree.getheight());
        
        int searchValue = 40; // Change this value to search for different elements
        boolean found = tree.searchele(searchValue);
        System.out.println("Element " + searchValue + " found: " + found);
    }
}




