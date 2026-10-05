package Day14;

public class Linkedlist4 {
    static Node head = null;
    static class Node {
        int data;
        Node next = null; 
        Node(int data ){
            this.data  = data;

        }
    }
    // Insert a number in Linklist 
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
    }
    // pop from last
    void pop(){
        if(head == null){
            System.out.println("Empty linklist");
            return ;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
            
        }
        System.out.println("The data is :" + temp.next.data);
        temp.next = null;
        

        
    }
public void add(int pos , int data){
        Node value = new Node(data);
        Node temp = head;
        if(pos == 0){   // insert at beginning
        value.next = head;
        head = value;
        return;
    }



        for(int i = 0 ; i<pos-1;i++){

            temp = temp.next;

        }
           value.next = temp.next;   // step 1
          temp.next = value;  
       
        
    }

         
    
    // Display the number
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
    public static void main(String[] args) {
        Linkedlist4 l = new Linkedlist4();
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
        System.out.println("");
        l.pop();
        l.display();
    }
}
