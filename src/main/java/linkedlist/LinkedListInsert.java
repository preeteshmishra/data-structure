package linkedlist;

public class LinkedListInsert {

  static   Node head;

   static class Node {

        int data;
        Node next;

        Node(int n) {

            this.data = n;
            next = null;

        }

    }

    void printList(){

       Node newNodes = head;
       while(newNodes != null){

           System.out.print(newNodes.data + "  ");
           newNodes = newNodes.next;
       }
        System.out.println();
       return;
    }
    void insertAtLast(int data){

       if (head == null){
           head = new Node(data);
           return;
       }

       Node last = head;

       while(last.next != null){

           last = last.next;
       }
       last.next = new Node(data);
return;

    }

    void insertAtBegining(int data){

       Node newNode = new Node(data);

       if(head == null) {
           head = newNode;
       }
       newNode.next = head;
       head = newNode;


    }


void insertAfter(Node prevNode, int num){

       Node n = new Node(num);

       n.next = prevNode.next;
       prevNode.next = n;

}

        public static void main(String []args){

        LinkedListInsert list = new LinkedListInsert();

        head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        list.head.next = second;
        second.next = third;
        third.next = null;

        list.printList();

        list.insertAfter(second,25);

            list.printList();

            list.insertAtLast(50);

            list.printList();

           list.insertAtBegining(5);

            list.printList();

    }
}
