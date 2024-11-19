package linkedlistdatastructure;

import java.util.LinkedList;
import java.util.ListIterator;

public class LLUsingCollection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("This");
        list.addLast("List");
        System.out.println(list);

        ListIterator<String> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next()+"->");
        }
        System.out.println("null");

        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println(list.get((list.size())-2));
    }
}
