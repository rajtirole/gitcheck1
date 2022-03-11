package javaCollection.list.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList1 {
    public static void main(String args[]){
        //arraylist is used when we need dynamic array in arraylist no need to define size of arraylist it can be inreasaed java give araylist a size when that size is filled then java increase size by n=n+n/2+1; and copy element of array in new array list it perform update delete and insert in O(n)
        ArrayList<Integer> arraylist1=new ArrayList<>();
        arraylist1.add(1);
        arraylist1.add(2);
        arraylist1.add(3);
        arraylist1.add(4);
        arraylist1.add(5);
        arraylist1.add(6);

        System.out.println(arraylist1.get(2));

        System.out.println(arraylist1.set(0, 6));
        System.out.println(arraylist1.isEmpty());
        System.out.println(arraylist1.contains(3));
        System.out.println(arraylist1.toString());
        System.out.println(arraylist1.lastIndexOf(arraylist1));
        arraylist1.remove(1);
        arraylist1.remove(2);
        arraylist1.remove(Integer.valueOf(5));
        arraylist1.set(4, 8); //it is in O(1)
        
        // arraylist1.clear();
        
        //ways to print araylist
        System.out.println(arraylist1);
        System.out.println(arraylist1.toString());
        Iterator<Integer> iterr= arraylist1.iterator();
        while(iterr.hasNext()){
            System.out.print(iterr.next());
        }

        for (Integer num : arraylist1) {
            System.out.print(num);
    
        }
        System.out.println();
        for(int i=0; i<arraylist1.size(); i++){
            System.out.print(arraylist1.get(i));
        }
        

    }
}