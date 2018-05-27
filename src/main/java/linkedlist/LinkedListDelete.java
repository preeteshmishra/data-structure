package linkedlist;

public class LinkedListDelete {

    static Node head;

    public static void main(String[] args) {

        LinkedListDelete list = new LinkedListDelete();

        head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        list.head.next = second;
        second.next = third;
        third.next = null;

        list.printList();

        list.deleteKey(-10);

        list.printList();
        list.deleteKeyAtPosition(2);

        list.printList();

        System.out.println("Size of LinkedList = " + list.lenghth());
    }

    void printList() {

        Node newNodes = head;

        while (newNodes != null) {

            System.out.print(newNodes.data + "  ");
            newNodes = newNodes.next;
        }
        System.out.println();
        return;
    }

    void deleteKeyAtPosition(int position) {

        if (head == null) return;

        Node temp = head;

        if (position == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < position - 1; i++) {

            temp = temp.next;

//            System.out.println(" +++   " + temp.data);



        }

        if (temp == null || temp.next == null) return;

        Node nex = temp.next.next;

       /* System.out.println(" ldl" + nex.data
        );*/

        temp.next = nex;


    }

    int lenghth(){

        Node temp = head;

        if(temp == null)return 0;
    int count = 0;

    while (temp != null){
        temp = temp.next;
        count ++;
    }
    return  count;

    }

    void deleteKey(int key) {


        Node temp = head, prev = null;

        if (temp != null && temp.data == key) {

            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {

            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return;

        prev.next = temp.next;


        return;

    }

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;


        }
    }
}