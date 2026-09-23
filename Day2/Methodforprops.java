package Day2;
import java.util.Arrays;

public class Methodforprops {
static int[] arr = {65,12,43,75,34,23,52,10};
    public static void main(String[] args) {
        //convert to string 
        System.out.println(Arrays.toString(arr));
        // sort
        Arrays.sort(arr);
        for(int x :arr){
            System.out.print(x + " ");
        }
        System.out.println(" ");
        // binary search
        int x = Arrays.binarySearch(arr , 23);
        System.out.println(x);
        // copy
        int[] copy = Arrays.copyOf(arr, 5);
        for(int y :copy){
              System.out.print(" " + y);
        }
    }
}
