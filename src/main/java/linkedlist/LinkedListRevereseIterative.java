package linkedlist;

public class LinkedListRevereseIterative {

    static Node head;

    void printList() {

        Node newNodes = head;
        while (newNodes != null) {

            System.out.print(newNodes.data + "  ");
            newNodes = newNodes.next;
        }
        System.out.println();
        return;
    }

    void reverseList() {

      //  System.out.println(head.data);

        Node current = head;
        Node next = null;
        Node prev = null;

        if (current == null) return ;

          while (current != null) {

                next = current.next;
                current.next = prev;
                prev = current;
                current = next;

               // System.out.println(prev.data + " | ");
            }
head = prev;
      //  return prev;
/*
        Node newNodes = head;
        while (newNodes != null) {

            System.out.print(newNodes.data + "  ");
            newNodes = newNodes.next;
        }
        System.out.println();*/

    }

    static class Node {

        int data;
        Node next;

        Node(int n) {

            this.data = n;
            next = null;

        }

    }

    public static void main(String[] args) {


        LinkedListRevereseIterative list = new LinkedListRevereseIterative();

        head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;

        list.printList();
       list.reverseList();
        list.printList();


    }
}

