package UAS.Binarytree;

import Pohon_Biner.BinaryTree;
import Pohon_Biner.Node;

public class binaryapp {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        Node youNode;
        
        youNode = new Node('20');
        tree.insert(youNode);
        
        youNode = new Node('30');
        tree.insert(youNode);
        
        youNode = new Node('40');
        tree.insert(youNode);
        
        youNode = new Node('50');
        tree.insert(youNode);
        
        youNode = new Node('70');
        tree.insert(youNode);
        
        System.out.print("Traversal dengan preOrder: ");
        tree.preOrder();
        System.out.print("\nTraversal dengan postOrder: ");
        tree.postOrder();
        System.out.print("\nTraversal dengan inOrder: ");
        tree.inOrder();
    }    
}
