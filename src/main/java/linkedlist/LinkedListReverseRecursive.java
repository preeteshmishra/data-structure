package linkedlist;

public class LinkedListReverseRecursive {


    static Node head;


    static class Node {

        int data;
        Node next;

        Node(int n) {

            this.data = n;
            next = null;

        }
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

    void reverseList(Node curr, Node prev) {

        /* If last node mark it head*/
        if (curr.next == null) {
            head = curr;

            /* Update next to prev node */
            curr.next = prev;
            return ;
        }

        /* Save curr->next node for recursive call */
        Node next1 = curr.next;

        /* and update next ..*/
        curr.next = prev;

        reverseList(next1, curr);
   //     return head;
    }





    public static void main(String []args) {

        LinkedListReverseRecursive list = new LinkedListReverseRecursive();

        head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;

        list.printList();
        list.reverseList(head,null);
        list.printList();
    }
}

