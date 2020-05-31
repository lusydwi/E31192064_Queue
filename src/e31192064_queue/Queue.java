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
public class Queue {
    public static void main(String[] args) {
		E31192064_Queue q = new E31192064_Queue();
                //mengambil elemeen
		q.deQueue();
                
                //mengambil elemen dari antrian
		q.enQueue(1); 
		q.enQueue(2); 
		q.enQueue(3); 

		q.deQueue();

		q.enQueue(4); 
		q.enQueue(5); 

		q.enQueue(7); 

		System.out.println(q.isFull());
                
                //Programan menampilkan size dan nilainya 
		System.out.println("Size " + q.getSize());
		q.show();
	}
}


