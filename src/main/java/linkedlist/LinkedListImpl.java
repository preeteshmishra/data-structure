package src.main.java.linkedlist;

public class LinkedListImpl {

  static   Node head;

    static class Node{

        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;

        }
    }


    public static void main(String []args){

        LinkedListImpl list = new LinkedListImpl();

        list.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        list.head.next = second;
        second.next = third;


/*Node n = list.head ;
int i = 1;
while(n!=null){
    System.out.println(i + "      node is   " + n.data);
i+=1;
    n = n.next;*/


Node n = head;
while(n != null){

    System.out.print(n.data + "   ");
    n = n.next;

        }
        System.out.println();

        Node newNode = new Node(-10);
newNode.next = head;
head = newNode;

        Node n1 = head;
        while(n1 != null){

            System.out.print(n1.data + "   ");
            n1 = n1.next;

        }

        Node a = new Node(50);
















    }






}
