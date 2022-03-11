package javaCollection.list.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist= new LinkedList<>();
        // List<Integer> linkedlist1= new LinkedList<>(); it make reference variable of list and object of linked list
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        linkedlist.add(5);
        linkedlist.add(6);

        System.out.println(linkedlist.remove());
        System.out.println(linkedlist.contains(4));
        System.out.println(linkedlist.contains(2));
        System.out.println(linkedlist.indexOf(3));
        System.out.println(linkedlist.offerFirst(2));
        System.out.println(linkedlist.getFirst());
        System.out.println(linkedlist.getLast());
        System.out.println(linkedlist.peek());
        // ways nto print linked list
        System.out.println(linkedlist);
        System.out.println(linkedlist.toString());
        for(Integer num: linkedlist){
            System.out.print(num);
        }
        for(int i=0; i<linkedlist.size(); i++){
            System.out.println(linkedlist.get(i));
        }
        Iterator<Integer> iterr= linkedlist.iterator();
        while(iterr.hasNext()){
            System.out.print(iterr.next());
        }

    }
    
}
