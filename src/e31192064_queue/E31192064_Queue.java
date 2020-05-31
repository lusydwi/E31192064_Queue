/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192064_queue;

/**
 *
 * @author Lusy
 */
public class E31192064_Queue {

    //inisialisasi
    int size, depan, rear;    //variable size, depan dan rear bertipe data integer
    int queue[] = new int[5]; //variable queue bertipe data integer memiliki nilai 5

    //method menambahkan elemen ke dalam antrian
    public void enQueue(int item) {
        if (!isFull()) {    //perulangan untuk antrian sudah penuh
            //mengisikan elemen
            queue[rear] = item; 
            rear = (rear + 1) % 5;
            size = size + 1; 
        } else {
            //program akan menampilkan data berikut apabila sudah penuh
            System.out.println("Antrian penuh!");
        }
    }

    //method mengambil elemen dari queue
    public int deQueue() {
        int item = queue[depan];//tipe data integer dengan variable item
        if (!isEmpty()) {   //perulangan apabila antrian kosong
            //mengambil elemen
            depan = (depan + 1) % 5;
            size = size - 1; 
        } else {
            //program akan menampilkan data berikut apabila antrian kosong
            System.out.println("Antrian Kosong..");
        }

        return item;
    }

    //method untuk menampilkan elemen yang ada di dalam antrian
    public void show() {
        System.out.print("Elemen antrian : ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(depan + i) % 5] + "\t");
        }
        System.out.println();
        System.out.print("\nNo. Antrian Keluar : \t");

        for (int n : queue) {
            System.out.print(n + "\t");
        }
        System.out.println("\t");
    }

    //deklarasi size
    public int getSize() {
        return size;
    }

    //utility untuk antrian kosong
    public boolean isEmpty() {
        return getSize() == 0;
    }

    //utility untuk antrian penuh
    public boolean isFull() {
        return getSize() == 5;
    }
}
