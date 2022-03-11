package javaCollection.queue.ArrayQueue.ArrayDequeue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeQueue1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        // it make arrayDeque reference variable and object of arraydeque we can add
        // element from both end in arraydeque
        arrayDeque.offer(2);
        arrayDeque.offer(3);
        arrayDeque.offer(2);
        arrayDeque.offer(8);
        arrayDeque.offer(9);
        arrayDeque.offerFirst(1);
        arrayDeque.offerLast(4);

        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());
        System.out.println(arrayDeque.contains(3));
        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque.pollFirst());
        System.out.println(arrayDeque.pollLast());
        arrayDeque.push(4);
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.isEmpty());

         // to get arraydeque element
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.toString());
        Iterator<Integer> iterr= arrayDeque.iterator();
        while(iterr.hasNext()){
            System.out.print(iterr.next());
        }
        for(Integer num: arrayDeque){
            System.out.print(num);
        }
        System.out.println();
        for(int i=0; i<arrayDeque.size(); i++){
            System.out.print(arrayDeque.poll());
        }

    }
}
