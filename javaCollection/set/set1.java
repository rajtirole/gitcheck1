package javaCollection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class set1 {
    public static void main(String[] args) {
        Set<Integer> set1= new HashSet<>();
    // it make reference variabale of set and object of hashset. we can not add duplcate element in set and element add in random order and print in random order
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set1.add(7);
        System.out.println(set1.remove(2));
        System.out.println(set1.size());
        System.out.println(set1.contains(3));
        System.out.println(set1.isEmpty());

        //to print set
        System.out.println(set1);
        System.out.println(set1.toString());
        Iterator<Integer> iterr=set1.iterator();
        while(iterr.hasNext()){
            System.out.print(iterr.next());
        }
        System.out.println();
        for(Integer num: set1){
            System.out.print(num);
        }
        System.out.println();
        for(int i=0; i<set1.size(); i++){
            System.out.println(set1.remove(i));
        }
    }
}
