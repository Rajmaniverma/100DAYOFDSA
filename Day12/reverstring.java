package Day12;
public class reverstring {
    static String reverse(String s , int n ){
        
        if(n<0){
            return " ";

        }
        
        char ch = s.charAt(n);
        return ch + reverse(s , n-1);
    }
    public static void main(String[] args) {
        String s = "hello";
        int n= s.length()-1;
        System.out.println(reverse(s, n));

    }
}