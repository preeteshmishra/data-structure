package linkedlist;

public class LinkedListRemoveDuplicates {


    static Node head;

    void printList() {

        Node nextN = head;
        while (nextN != null) {

            System.out.print(nextN.data + "  ");
            nextN = nextN.next;
        }
        System.out.println();
        return;
    }


    static class Node {

        int data;
        Node next;

        Node(int n) {

            this.data = n;
            next = null;

        }
    }

    void push(int n) {

        Node new_node = new Node(n);

        new_node.next = head;
        head = new_node;

    }



    public static void main(String[] args) {



    LinkedListRemoveDuplicates list = new LinkedListRemoveDuplicates();
    list.push(10);
        list.push(10);
        list.push(20);
        list.push(10);
        list.push(20);
        list.push(50);

        list.printList();

     //   list.removeDuplicates();

        list.printList();



}
}
