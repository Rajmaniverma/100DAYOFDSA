package Day12;

import Day2.Arrayprop.student;

public class Maxvalarr {
    static int k = -1;
    static int maxval(int[] arr , int n ){
        if(n<0){
            return -1;
        }
        if(k<arr[n]){
            k=arr[n];
        }
        maxval(arr, n-1);
        return k;

    }
    public static void main(String[] args) {
        int[] arr = {104,42,16,16,23,75,85,43,12};
        int  n= arr.length -1 ;
        System.out.println(maxval(arr, n));
    }
}
