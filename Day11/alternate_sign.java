package Day11;

public class alternate_sign {
   static int alternate(int n ){
    if(n== 0 ){
      return 0 ;
    }
     return  n + (-1)*alternate(n-1);
   }
    public static void main(String[] args) {
        System.out.println(alternate(5));
    }
}
