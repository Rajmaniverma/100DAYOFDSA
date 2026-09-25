package Day4;

public class reversenumb {
    static void numb(int n){
        if(n==0){
            return;
        }
         System.out.println(" ");
        System.out.print("reverse number " + " "+ n);
        numb(n-1);
       

    }
    public static void main(String[] args) {
        numb(10);
    }
}
