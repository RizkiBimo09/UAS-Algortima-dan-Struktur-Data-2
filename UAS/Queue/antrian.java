package UAS.Queue;
public class antrian {
    private int ukuran;
    private long[] antrian;
    private int belakang;
    private int jumlahitem;
    private int depan;
    
    public antrian(int a){
        ukuran = a;
        antrian = new long[ukuran];
        depan = 0;
        belakang = -1;
        jumlahitem = 0;
    }
    
    public void enqueue(long b){
        if (!isFull()){
            antrian[++belakang] = b;
            jumlahitem++;
        }
    }
    
    public long dequeue(){
        long temp = antrian[0];
        if (!isEmpty()){
            for (int i=0; i<jumlahitem; i++)
                antrian[i] = antrian[i+1];
                jumlahitem--;
                belakang--;
            
        }
        return temp;
    }
    
    public boolean isEmpty(){
        return (jumlahitem == 0);
    }
    
    public boolean isFull(){
        return (belakang == ukuran-1);
    }
    
    public long peek(){
        return antrian[depan];
    }
    
    public int ukuran(){
        return ukuran;
    }
    
    public void show(){
        for (int i=0; i<jumlahitem; i++)
            System.out.print(antrian[i]+" ");
        System.out.println("");
    }
    
}

    
