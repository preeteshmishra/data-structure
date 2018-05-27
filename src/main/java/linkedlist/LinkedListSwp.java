package linkedlist;

public class LinkedListSwp {
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

        Node newNode = head;

        while (newNode != null) {

            System.out.print(newNode.data + "   ");

            newNode = newNode.next;

        }

    }

    void push(int n) {

        Node new_node = new Node(n);

        new_node.next = head;
        head = new_node;

    }


    void swap(int x , int y ){

        if(x == y)return;

        //check for link of x

        Node prevX = null,currX = head;

        while(currX != null &&  currX.data != x){

            prevX = currX; //link of previous node of x
            currX = currX.next; // link of x
        }

        Node prevY = null, currY = head;

        while(currY != null &&  currY.data != y){

            prevY = currY; // link of previous node of y
            currY = currY.next; // link of y
        }

        if(currX == null || currY == null)return;

        if(prevX != null){
            prevX.next = currY;
        }else{

            head = currY;
        }
if(prevY != null){
            prevY.next = currX;
}else{
            head = currY;
}


Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public static void main(String[] args) {


        LinkedListSwp list = new LinkedListSwp();

        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        list.push(60);

        System.out.print("Before Swap of 50 and 20 --->");

        list.printList();

        System.out.println();

        System.out.print("After Swap of 50 and 20 --->");

        list.swap(50,20);

        list.printList();
    }


}



