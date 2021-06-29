package Pohon_Biner;
public class BinaryTree {
    Node root;
    public boolean isEmpty(){
        return (root==null);
    }
    //method insert data
    public void insert(Node input){
        if (isEmpty()){
            root = input;
        }else{
	//mencari parent yg sesuai
            Node current = root;
            Node parent = null;
            boolean diKiri = true;
            while (current != null){
                parent = current;
	//data yang diinput lebih besar akan bergerak kekanan
                if (current.data < input.data){
                    current = current.right;
                    diKiri = false;
	//else bergerak ke kiri
                }else if (current.data > input.data){
                    current = current.left;
                    diKiri = true;
                }else{
                    System.out.println("data"+input.data+"is exist");
                    break;
                }
            }
	//menghubungkan ke parent
            if (diKiri){
                parent.left = input;
            }else{
                parent.right = input;
            }
        }
    }
    
    public void preOrder(){
        preOrdered(root);
    }
    
    public void inOrder(){
        inOrdered(root);
    }
    
    public void postOrder(){
        postOrdered(root);
    }
    
    public void preOrdered(Node root){
        if (root != null){
            System.out.print(root.data+" ");
            preOrdered(root.left);
            preOrdered(root.right);
        }
    }
    
    public void inOrdered(Node root){
        if (root != null){
            inOrdered(root.left);
            System.out.print(root.data+" ");
            inOrdered(root.right);
        }
    }
    
    public void postOrdered(Node root){
        if (root != null){
            postOrdered(root.left);
            postOrdered(root.right);
            System.out.print(root.data+" ");
        }
    }
    //method mencari data
    public Node search (int key){
        Node youNode = null;
        Node current = root;
	//lakukan pencarian selama current bukan null
        while (current != null){
            if (current.data == key){
                return youNode;
            }else{
                if (current.data < key){
                    current = current.right;
                }else{
                    current = current.left;
                }
            }
        }
        return youNode;
    }
}
    

