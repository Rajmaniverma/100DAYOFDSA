package dsainjava.Abstraction;

public class Abstractions {
    public static abstract class animal{
        abstract void sound();//abstract method
        void eat(){
            System.out.println("eating food");//concrete method
        }
    }
    class dog extends animal{
        void sound(){
            System.out.println("hello");
        }
    }
    public static void main(String[] args) {
        
    }
}
