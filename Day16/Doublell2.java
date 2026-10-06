package Day16;

// The import is unnecessary because they are in the same package, 
// but it won't break anything if left there.

public class Doublell2 {
    // 1. Made static to match the static field below
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node head = null;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // 2. Added a display method specifically for Doublell2's nodes
    public void display() {
        if (head == null) {
            System.out.println("Doublell2 is empty");
            return;
        }
        Node temp = head;
        System.out.println("Forward print:");
        while (temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(temp.data);

        System.out.println("Reverse print:");
        while (temp != null) {
            System.out.print(temp.data + "<-");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    void Pushatbegin(int data){
        Node  val = new Node(data);
        if(head== null){
            head = val;
            return ;
        }
    val.next = head;
    head.prev = val;
    
    // Move the head pointer to the new node
    head = val; 



    }
    void insertAt(int pos, int data) {
    if (pos < 0) {
        System.out.println("Invalid position");
        return;
    }
    
    if (pos == 0) {
        Pushatbegin(data);
        return;
    }
    
    Node newNode = new Node(data);
    Node temp = head;
    
    // Move temp to the node just before the target position
    for (int i = 0; i < pos - 1 && temp != null; i++) {
        temp = temp.next;
    }
    
    if (temp == null) {
        System.out.println("Position out of bounds");
        return;
    }
    
    // Link the new node into the list
    newNode.next = temp.next;
    newNode.prev = temp;
    
    // Update the node after the new node, if it exists
    if (temp.next != null) {
        temp.next.prev = newNode;
    }
    
    // Attach the new node to the previous node
    temp.next = newNode;
}


    public static void main(String[] args) {
        Doublell2 dl = new Doublell2();
        dl.insert(10);
        dl.insert(20);
        dl.insert(30);
        dl.insert(40);
        dl.insert(50);
        
        // 3. Call the display method belonging to this object instance
        dl.display();
        dl.Pushatbegin(55);
        dl.display();
    }
}
