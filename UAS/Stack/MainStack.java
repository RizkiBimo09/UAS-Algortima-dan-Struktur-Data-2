package UAS.Stack;
public class MainStack {
     public static void main(String[] args) {
        stack newStack = new stack(10);
        newStack.push(8);
        newStack.printData();
        newStack.push(2);
        newStack.printData();
        newStack.push(3);
        newStack.printData();
        long nilaiteratas=newStack.peek();
        System.out.println("nilai teratas = "+nilaiteratas);
        System.out.println ("Nama saya adalah Rizki Bimo Wijaya");
        long nilaiyangdihapus = newStack.pop();
        System.out.println("");
        newStack.push(2);
        newStack.printData();
        newStack.push(8);
        newStack.printData();
        System.out.println();
    }   
}
