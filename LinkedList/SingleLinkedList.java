package Java_Programming.LinkedList;
import java.util.*;
import java.lang.classfile.components.ClassPrinter.Node;

class SingleLinkedList{
    Node head;
    class Node{
        String data;
        Node Next;
        Node(String data){
            this.data=data;
            this.Next=null;
        }
    }

    // adding element at first of linkedlist

    public void addFirst(String data){
        Node NewNode = new Node(data);
        if(head == null){
            head = NewNode;
            return;
        }
        NewNode.Next = head;
        head = NewNode;
    }

    // addiing element at last of linkedlist

    public void addLast(String data){
        Node NewNode = new Node(data);
        if(head == null){
            head = NewNode;
            return;
        }
        Node CurrNode = head;
        while(CurrNode.Next != null){
            CurrNode = CurrNode.Next;
        }
        CurrNode.Next= NewNode;
    }

    //Print linked list 

    public void PrintList(){
        Node CurrNode = head;
        while(CurrNode != null){
            System.out.print(CurrNode.data+"->");
            CurrNode = CurrNode.Next;
        }
        System.out.println("NULL");
    }

    // Delete the First Element

    public void DeleteFirst(){
        if(head == null){
            System.out.println("List Is Empty");
            return;
        }
        head = head.Next;
    }

    // Delete the Last Element

    public void DeleteLast(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if(head.Next == null){
            head= null;
            return;
        }

        Node secondlastNode = head;
        Node lastNode = head.Next;
        while(lastNode.Next != null){
            lastNode = lastNode.Next;
            secondlastNode = secondlastNode.Next;
        }
        secondlastNode.Next = null;

    }

    public static void main(String[] args) {
        SingleLinkedList sl = new SingleLinkedList();
        sl.addFirst("Lokesh");
        sl.addFirst("Bammidi");
        sl.PrintList();
        sl.addLast("Steave");
        sl.addLast("Karan");
        sl.PrintList();
        sl.DeleteFirst();
        sl.PrintList();
    }
}