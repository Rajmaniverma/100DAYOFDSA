package Day12;

public class PrintArrayrecursive {
    static void recursive(int [] arr, int n ){
      
       if(n<0){
        return ;
       }

      recursive(arr, n-1);

      System.out.println("array of index "+ n + ":" + arr[n]);
    }

    public static void main(String[] args) {
             int[] arr = {1,2,3,4,5,6,7,8};
             int length = arr.length - 1;
        recursive(arr , length);
      
    }
    


}
