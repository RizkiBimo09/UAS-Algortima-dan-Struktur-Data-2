package Pohon_Biner;
public class BinaryApp {
public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        Node youNode;
        
        youNode = new Node('D');
        tree.insert(youNode);
        
        youNode = new Node('B');
        tree.insert(youNode);
        
        youNode = new Node('A');
        tree.insert(youNode);
        
        youNode = new Node('C');
        tree.insert(youNode);
        
        youNode = new Node('F');
        tree.insert(youNode);
        
        youNode = new Node('E');
        tree.insert(youNode);
        
        youNode = new Node('G');
        tree.insert(youNode);
        
        System.out.print("Traversal dengan preOrder: ");
        tree.preOrder();
        System.out.print("\nTraversal dengan postOrder: ");
        tree.postOrder();
        System.out.print("\nTraversal dengan inOrder: ");
        tree.inOrder();
    }    
}
