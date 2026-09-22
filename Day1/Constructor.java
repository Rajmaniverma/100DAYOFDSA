package Day1;

public class Constructor {
    // 1. Removed 'static' here
    int a;
    int b;

    Constructor(int a, int b) {
        this.a = a; // Now 'this' correctly refers to instance variables
        this.b = b;
    }

    // 2. Removed 'static' here so it can access instance variables
    void sum() {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Constructor ct = new Constructor(10, 20);
        ct.sum(); // Call it using the object 'ct'
    }
}
