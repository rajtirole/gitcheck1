package javaCollection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class list1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;

        for (int i = 0; i <= 10; i++) {
            c = a + b;
            System.out.print(c);
            b = a;
            a = c;
        }

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(5);
        list.add(1);
        list.add(8);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        for (Integer num : list) {
            System.out.print(num);
        }

    }

}
