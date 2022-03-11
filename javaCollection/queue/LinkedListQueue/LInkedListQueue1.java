package javaCollection.queue.LinkedListQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LInkedListQueue1 {
    public static void main(String args[]){
        Queue<Integer> LinkedListQueue= new LinkedList<>();
        //it make reference variable of queue and object of linkedlist
        LinkedListQueue.offer(1);
        LinkedListQueue.offer(2);
        LinkedListQueue.offer(3);
        LinkedListQueue.offer(4);
        LinkedListQueue.offer(5);
        
        System.out.println(LinkedListQueue.poll());
        System.out.println(LinkedListQueue.element());
        System.out.println(LinkedListQueue.isEmpty());
        System.out.println(LinkedListQueue.peek());
        //ways to print queu
        System.out.println(LinkedListQueue);
        System.out.println(LinkedListQueue.toString());
        for (Integer num : LinkedListQueue) {
            System.out.print(num);
            
        }
        // for(int i=0; i<LinkedListQueue.size();i++){
        //     System.out.println(LinkedListQueue.poll();
        // }
        Iterator<Integer> iterr= LinkedListQueue.iterator();
        while(iterr.hasNext()){
            System.out.println(iterr.next());
        }
    }
    
}
