package javacollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceMethodDemo {
    public static void main(String[] args) {

        // 1. add(E e)
        List<String> list= new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");

        System.out.println("List after adding: "+list);

        // 2. add(int index, E element)
        list.add(1,"strawberry");
        System.out.println("List after adding at particular index: "+list);

        // 3. get(int index)
        String secondFruit = list.get(1);
        System.out.println("Second Fruit: " + secondFruit);

        //4. remove(int index)
        list.remove(1);
        System.out.println("List after removing 2nd fruit: "+list);

        // 5. set(int index, E element)
        list.set(1,"Kiwi");
        System.out.println("List after modification: "+list);

        // 6. size()
        System.out.println("List size: "+list.size());

        // 7. contains(Object o)
        System.out.println("List contains kiwi: "+list.contains("Kiwi"));

        // 8. indexOf(Object o)
        int index = list.indexOf("Banana");
        System.out.println("Index of Banana: " + index); // Output: 1

        // 9. clear()
        list.clear(); // Clear the list
        System.out.println("Fruits List after clear: " + list); // Output: []

        // 10. toArray()
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
//        String[] str=new String[list.size()];
//        str=list.toArray(str); (or)
        String[] fruitArray = list.toArray(new String[0]); // size 0 is not considered it is just to infer type
        System.out.println("Fruit Array: " + String.join(", ", fruitArray));

        // 11. Demonstrating ListIterator
        ListIterator<String> listIterator = list.listIterator();
        System.out.println("\nTraversing the list forward:");
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);
        }

        System.out.println("\nTraversing the list backward:");
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            System.out.println(fruit);
        }

        // 12. Using set() to replace an element
        listIterator = list.listIterator(); // Reset iterator to start
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            if (fruit.equals("Banana")) {
                listIterator.set("Mango"); // Replace "Banana" with "Mango"
            }
        }
        System.out.println("\nList after replacing Banana with Mango: " + list);

        // 13. Using add() to insert an element
        listIterator = list.listIterator(); // Reset iterator to start
        listIterator.add("Grapes"); // Insert "Grapes" at the current position i,e 0 here
        System.out.println("List after adding Grapes: " + list);

        // 14. Using remove() to remove the last element returned by next()
        listIterator = list.listIterator(); // Reset iterator to start
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            if (fruit.equals("Cherry")) {
                listIterator.remove(); // Remove "Cherry"
            }
        }

        System.out.println("List after removing Cherry: " + list);

        //normal iterator
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            String fruit=iterator.next();
            System.out.println(fruit);
        }

        iterator.remove(); //Removes from the underlying collection the last element returned by this iterator This method can be called only once per call to nex
        System.out.println(list);
    }
}
