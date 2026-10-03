package Day12;

public class Sumofelement {
    static int k = 0;
    static int sum(int [] arr , int length){
        if(length <0){
            return -1;
        }
        k += arr[length];
        sum(arr, length-1);
        return k;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length -1;
        System.out.println(sum(arr, n));
    }
}
