package linkedlist;

public class LinkedListMiddleElement {


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

    void insert(int num) {

        Node current = head;

        int count = 0,pos;
        while(current != null){

            current = current.next;
            count ++;
        }

        if(count % 2 == 0)
            pos = count/2;
        else
            pos = (count+1)/2;

      //  System.out.println(pos);

        Node curr = head;
        Node prev =null;
       // int  cnt = 0;

       for(int i = 0; curr !=null && i<pos-1  ; i++) {

         //  System.out.print(curr.data);
           prev= curr;
           curr = curr.next;

        //   System.out.println(prev.data + "  "  + curr.data);

       }

        Node newNod = new Node(num);
        newNod.next = curr.next;
         curr.next = newNod;


    }

 void insertAtMid(int num){

        if(head == null)
        head = new Node(num);

        else
        {
            Node newNode  = new Node(num);


        Node slow = head;
        Node fast = head.next;


        while(fast != null && fast.next !=null) {

slow = slow.next;
fast = fast.next.next;

        }


        newNode.next = slow.next;
        slow.next = newNode;


        }
}


    public static void main(String[] args) {

        LinkedListMiddleElement list = new LinkedListMiddleElement();

        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        list.printList();



        System.out.println("After insert");

        list.insertAtMid(35);

        list.printList();


    }
}
