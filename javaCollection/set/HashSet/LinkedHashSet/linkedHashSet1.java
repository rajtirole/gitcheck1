package javaCollection.set.HashSet.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashSet1 {
    public static void main(String[] args) {
        Set<Integer> linkedhashset= new LinkedHashSet<>();
        //it make reference variable of set and object of linkedhashset but in this order is maintain elements are in order in which they get insert
        linkedhashset.add(2);
        linkedhashset.add(3);
        linkedhashset.add(4);
        linkedhashset.add(5);
        linkedhashset.add(6);
        linkedhashset.add(8);
        //to print linkedhashset
        System.out.println(linkedhashset);
        System.out.println(linkedhashset.toString());
        Iterator<Integer> iterr= linkedhashset.iterator();
        while(iterr.hasNext()){
            System.out.print(iterr.next());
        }
        for(Integer num:linkedhashset){
            System.out.print(num);
        }
        for(int i=0; i<linkedhashset.size(); i++){
            System.out.print(linkedhashset.remove(i));
        }
    }
    
}
