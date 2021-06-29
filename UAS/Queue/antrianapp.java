package UAS.Queue;

import Antrian.Queue;

public class antrianapp {
     public static void main(String[] args) {
        Queue newqueue = new Queue(10);
        newqueue.enqueue(8);
        newqueue.show();
        newqueue.enqueue(8);
        newqueue.show();
        System.out.println("yang diambil dari antrian = " + newqueue.dequeue());
        System.out.println("Nama saya adalah Rizki Bimo Wijaya");
        System.out.println("");
        newqueue.enqueue(8);
        newqueue.show();
        newqueue.enqueue(7);
        newqueue.show();
        System.out.println("nilai paling depan = " + newqueue.peek());
        
    }
    
}

