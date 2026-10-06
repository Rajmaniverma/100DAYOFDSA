package Day16;

public class Doublell {
   static Node head = null;
   public static class Node {
    int data ;
    Node next = null;
    Node prev = null;
    Node(int data){
        this.data = data;
    }
   }
    public  void insert(int data){
        Node newNode= new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next =newNode;
        newNode.prev =temp;

    }
public static void displayDLL(){
    if(head == null){
        System.out.println("Double linklist is empty");
        return;
    }
    
    Node temp = head;
    System.out.println("Sidha print");
    
    // 1. Forward print: Keep track of the last node by checking temp.next
    while(temp.next != null){ 
        System.out.print(temp.data + "->");
        temp = temp.next;
    }
    System.out.println(temp.data); // Print the last node's data

    System.out.println("ulta print");
    
    // 2. Reverse print: Start from the last node (temp) and move backwards
    while(temp != null){
        System.out.print(temp.data + "<-");
        temp = temp.prev;
    }
    System.out.println("null");
}

    
   public static void main(String[] args) {
    Doublell dll = new Doublell();
    dll.insert(10);
    dll.insert(20);
    dll.insert(30);
    dll.insert(40);
    dll.insert(50);
    dll.displayDLL();
   }
}
