
package Day14;

public class Linkedlist3 {
    static Node head = null;
    public class Node {
        int data ;
        Node next = null;
        Node(int data){
            this.data = data ;
        }

    }


    void insertNode(int data){
        Node val = new Node(data);
        if(head == null){
           head = val;
           return ;
        }
        Node temp = head;
        while(temp.next != null){
           temp = temp.next;
        }
        temp.next = val;
        // System.out.println("data save successfully");
    }
    void display(){
        if(head == null){
            System.out.println("Link list is empty");
            return ;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
    }

    void pop(){
        if(head == null){
            System.out.println("Link list is empty");
            return;
        }
    
        Node temp = head;
        while(temp.next.next != null){
              temp = temp.next;
        }
        temp.next= null;

        System.out.println("");
    }


    public static void main(String[] args) {
        Linkedlist3 l = new Linkedlist3();
        l.insertNode(20);
        l.insertNode(30);
        l.insertNode(40);
        l.insertNode(50);
        l.insertNode(60);
        l.insertNode(70);
        l.insertNode(80);
        l.insertNode(90);
        l.insertNode(100);
        l.insertNode(200);
        l.insertNode(210);
        l.insertNode(220);
        l.insertNode(230);
        l.insertNode(240);
        l.display();
        l.pop();
        l.display();
    }
}
