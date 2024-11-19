package javacollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterfaceFullDemo {
    public static void main(String[] args) {

        // 1. add(E e) - Adds a single element to the collection
        Collection<String> collection = new ArrayList<>();
        collection.add("apple");
        collection.add("banana");
        collection.add("mango");
        collection.add("guava");

        System.out.println("Collections after add method"+collection);

        // 2. addAll(Collection<? extends E> c) - Adds all elements from another collection
        Collection<String> collection1= new ArrayList<>();
        collection1.add("gooseberry");
        collection1.add("strawberry");

        collection.addAll(collection1);
        System.out.println("Collections after addAll method"+collection);

        // 3. contains(Object o) - Checks if the collection contains a specific element
        System.out.println("Collection contains mango: "+collection.contains("mango"));
        System.out.println("Collection contains grapes: "+collection.contains("grapes"));

        // 4. containsAll(Collection<?> c) - Checks if collection contains all elements of another collection
        System.out.println("Collection contains all elements of collection1: "+collection.containsAll(collection1));

        // 5. isEmpty() - Checks if the collection is empty
        System.out.println("Is the collection empty? " + collection.isEmpty());

        // 6. size() - Returns the number of elements in the collection
        System.out.println("Check the collections size: "+collection.size());

        // 7. remove(Object o) - Removes a single instance of the specified element
        collection.remove("mango");
        System.out.println("Collection after removing the mango: "+collection);

        // 8. removeAll(Collection<?> c) - Removes all elements from the collection that are also in another collection
        System.out.println("Collection after removing collection1 from collection: "+collection.removeAll(collection1));
        System.out.println("Collection after removing: "+collection);

        // 9. retainAll(Collection<?> c) - Retains only elements that are also in another collection
        Collection<String> collection2= new ArrayList<>();
        collection2.add("banana");
        System.out.println("Collection after retainAll: "+collection.retainAll(collection2));
        System.out.println("Collection after retainAll: "+collection);

        // 10. clear() - Removes all elements from the collection
        collection.clear();
        System.out.println("Clear all the from collection: "+collection);

        // 11. toArray() - Converts collection to an array
        collection.add("pomegranate");
        collection.add("kiwi");
        collection.add("Lemon");
        Object[] arr=collection.toArray();
        System.out.println("Array from collection: ");
        for(Object o:arr){
            System.out.println(o);
        }

        // 12. toArray(T[] a) - Converts collection to a typed array
        String[] str=new String[collection.size()];
        str=collection.toArray(str);
        System.out.println("String array from collection after conversion: ");
        for(String s:str){
            System.out.println(s);
        }

        // 13. iterator() - Returns an iterator over the elements in the collection
        Iterator<String> iterator = collection.iterator();
        System.out.println("Iterating over the collection:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 14. equals(Object o) - Checks if this collection is equal to another collection
        Collection<String> collection3 = new ArrayList<>();
        collection3.add("pomegranate");
        collection3.add("kiwi");
        System.out.println("Collection equals collection3: " + collection.equals(collection3));
        collection3.add("Lemon");
        System.out.println(collection+" "+collection3);
        System.out.println("Collection equals collection3: " + collection.equals(collection3));


        // 15. hashCode() - Returns the hash code value for the collection
        System.out.println("Hash code of the collection: " + collection.hashCode());
    }
}
