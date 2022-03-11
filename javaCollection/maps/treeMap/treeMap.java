package javaCollection.maps.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        // it put elements in tree structure it is sorted
        Map<Integer, String> treeMap = new TreeMap<>();
        // it make reference variable of map and object of tree map
        treeMap.put(1, "aman");
        treeMap.put(4, "krishna");
        treeMap.put(3, "ayush");
        treeMap.put(5, "raj");
        System.out.println(treeMap);
        System.out.println(treeMap.get(3));
        System.out.println(treeMap.values());
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.entrySet());
        for (Map.Entry<Integer, String> r : treeMap.entrySet()) {
            System.out.print(r);
            System.out.print(r.getKey());
            System.out.print(r.getValue());
            
        }
    }

}
