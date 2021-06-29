package UAS.Stack;
public class stack {
public int ukuran;
    public long[] tumpukan;
    public int top;
    
    public stack(int data){
    ukuran = data;
    tumpukan =  new long[ukuran];
    top = -1;
    }
    
    public void push(long data){
        tumpukan[++top] = data;
    }
    
    public long pop(){
        return tumpukan[top--];
    }
    
    public long peek(){
        return tumpukan[top];
    }
    
    public boolean isEmpty(){
        return (top == ukuran-1);
    }
    
    public boolean isFull(){
        return (top == ukuran-1);
    }
    
    public void printData(){
        int i = top;
        while (i>=0){
            System.out.print(tumpukan[i]+" ");
            i--;
        }
        System.out.println("\n");
    }
    
}
