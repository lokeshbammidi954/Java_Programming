/*
Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.
 */

package Java_Programming.LinkedList;

import java.util.LinkedList;

public class DeleteNode {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=1;i<=50;i++){
            list.add(i);
        }
        System.out.print(list);
        
        for(int j=26;j<list.size();j++){
            list.remove(j);
        }
        System.out.println(list);
    }
}
