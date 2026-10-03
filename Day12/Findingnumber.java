package Day12;

public class Findingnumber {
    static int traverse(int [] arr , int l, int key){
        if(l<0){
            return -1;
        }
        if(key==arr[l]){
            return l;
        }
        return traverse(arr, l-1, key);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("The index is:"+ traverse(arr, arr.length-1, 12));
    }
}
