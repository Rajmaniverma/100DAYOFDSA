package Day11;

public class PrintKnum {
    static void multiple(int p , int q ){
        if(q==0){
            return;
        };
        multiple(p, q-1);
        System.out.println(p*q);
       
    }
    public static void main(String[] args) {
     multiple(5,5);
    }
}
