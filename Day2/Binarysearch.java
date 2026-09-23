package Day2;

public class Binarysearch {
    static int search(int [] arr ,int  low ,int  high,int key ){
    if  (low > high){
        return -1;
    }
    while(low <= high){

    
    int mid  = (low + high)/2;
    if(arr[mid] == key){
        return mid;
    }
    else if (arr[mid]>key){
         high = mid-1;

        
    }
    else {
         low = mid + 1;
    }
    
}
return  -1;

    }
    public static void main(String[] args) {
        int[] arr = { 43 ,52, 23 ,25,75 ,64 ,34 };
        int low = 0 ; 
        int high = arr.length-1;
        int key = 25;
        int restult = search(arr, low, high, key);
        System.out.println(restult);
    }
}
