package Day3;

public class Reversearr {
    static  int []  reverse(int[] arr){
      int i = 0 ; 
      int j = arr.length -1;
      while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
        i++;
        j--;
      }
      return arr;
     }

    public static void main(String[] args) {
        int [] arr = {2,3,1,4,6,4,3};
        int[] crr = reverse(arr);
        for(int x: arr){
            System.out.print(" " + x);
        }
    }
}
