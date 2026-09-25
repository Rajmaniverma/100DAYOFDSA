package Day4;

public class SumNatural {
    static int sum(int n){
        if(n== 0){
            return 0 ;
        }
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        int n = sum(15);
        System.out.println(n);
    }
}
