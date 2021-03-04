package lesson4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        /*
        contains();
        clear();
        isEmpty();
        removeAll();
        retainAll();
         */

//        ArrayList<Integer> list1 = new ArrayList<Integer>();
//        list1.add(12);
//        list1.add(43);
//        list1.add(15);
//        list1.add(67);
//        list1.add(43);
//
//        ArrayList<Integer> newList = new ArrayList<Integer>();
//        newList.add(12);
//
//        list1.retainAll(newList);
//
//        System.out.println(list1);

        /*
        HASHSET to List
         */

        HashSet<Employee> hashSet = new HashSet<Employee>();
        hashSet.add(new Employee("Mike", 3500, "Accounting"));
        hashSet.add(new Employee("Paul", 3000, "Admin"));
        hashSet.add(new Employee("Peter", 4000, "IT"));
        hashSet.add(new Employee("Angel", 2000, "Maint"));


        ArrayList<Employee> myList = new ArrayList<Employee>(hashSet);

        Collections.sort(myList);

        System.out.println(myList);



    }
}
