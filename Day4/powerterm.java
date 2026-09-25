package Day4;

public class powerterm {
    static int pow(int a , int b ){
        if(b == 0){
            return 1;
        }
        b--;
        return a*pow(a,b);
    }

    public static void main(String[] args) {
        int n = pow(8,3);
        System.out.println(n);
    }
}
