package linkedlist;

public class LinkListFindByIndex {

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

    void finfByIndex(int pos){

        Node temp = head;
        for(int i = 0;head !=null && i<pos;i++){

temp = temp.next;
        }
        if(temp ==null || temp.next == null){System.out.println("Not found");return;}

        System.out.println("Found at position    " + " " + pos + "  element is " + temp.data);
    }

    void pushIn(int num){

        Node newNode = new Node(num);

        newNode.next = head;
        head = newNode;

    }

    void countAppearance(int num){

        int count = 0;

        while(head != null){



            if(head.data == num){
                count ++;
            }
            head = head.next;


        }
        System.out.println("Total count of " + num + " is " + count);
    }

    public static void main(String[] args) {

        LinkListFindByIndex list = new LinkListFindByIndex();
        int position = 3;

        list.pushIn(10);
        list.pushIn(20);
        list.pushIn(30);
        list.pushIn(40);
        list.pushIn(50);
        list.pushIn(20);
        list.pushIn(20);
        list.pushIn(20);


        list.printList();
        list.finfByIndex(position);
      //  list.delete();

       // System.out.println("After delete");

       // list.printList();

list.countAppearance(20);


    }

    void delete(){
        head = null;
        System.out.println("deleted");
    }
}
