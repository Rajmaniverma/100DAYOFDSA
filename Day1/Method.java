package Day1;

public class Method {
    public static int n ;
    public int sum(int a , int b){
        return a + b;
    }
    public static int add(int c , int d){
        return c+d;
    }
    public static void main(String[] args) {
        // without static -> create object then call method
        Method mt = new Method();
        n=mt.sum(10, 20);
        System.out.println(n);
        //  with static
        int x =add(10, 40);
        System.out.println(x);
    }
}
