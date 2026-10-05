package Day14;



public class Linkedlist2 {
    

    public class Node {
        int data ;
        Node next ;
        Node(int data){
            this.data =data;
            this.next = null;
        }
        
    }
    Node head = null;
    public  void insert(int data ){
      Node newnode = new Node(data);
    
      if(head == null){
          head = newnode;
          return ;
      }
      Node temp = head;
      while(temp.next != null){
        temp = temp.next;
      }
      temp.next = newnode;
    



    
 
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
        

    }
    public static void main(String[] args) {
        Linkedlist2  list = new Linkedlist2();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.insert(80);
        list.insert(90);
        list.display();

    }
    
}
