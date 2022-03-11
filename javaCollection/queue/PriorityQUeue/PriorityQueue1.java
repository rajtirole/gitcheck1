package javaCollection.queue.PriorityQUeue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        Queue<Integer> PriorityQueue= new PriorityQueue<>();
        //it make queue reference variable and priority queue object it impliment min heap so priority is give to small element we can change priority
        Queue<Integer> PriorityQueue1= new PriorityQueue<>(Comparator.reverseOrder());

        // PriorityQueue<Integer> priorityQueue2= new PriorityQueue<>(); it make priorityqueue reference variable and priority queue object
        PriorityQueue.offer(5);
        PriorityQueue.offer(3);
        PriorityQueue.offer(2);
        PriorityQueue.offer(1);
        PriorityQueue.offer(8);
        //ways to print priority queue
        System.out.println(PriorityQueue);
        System.out.println(PriorityQueue);
        for(Integer num:PriorityQueue){
            System.out.print(num);
        }
        int i= PriorityQueue.size();
        for(i=0; i<=PriorityQueue.size(); i++){
            System.out.print(PriorityQueue.poll());

        }


    }
    
}
