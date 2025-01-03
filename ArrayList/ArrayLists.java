package Java_Programming.ArrayList;
import java.util.Collections;
import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //adding element to list
        list.add(1);
        list.add(20);
        list.add(13);
        list.add(45);
        System.out.println(list);
        //get method
        int element = list.get(0);
        System.out.println(element);
        //add between array
        list.add(1,3);
        System.out.println(list);
        // set element
        list.set(0,5);
        System.out.println(list);
        //remove or delete 

        list.remove(3);
        System.out.println(list);

        //size of list
        int size = list.size();
        System.out.println(size);
        //looping
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
