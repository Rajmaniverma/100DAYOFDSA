package Day4;

public class Naturalno {
    static void numb(int n){
        if(n==0){
            return;
        }
        
        numb(n-1);
        System.out.println(" ");
        System.out.print("second number " + " "+ n);
    }
    public static void main(String[] args) {
        numb(10);
    }
}
