package Day2;

public class mergesort {
static void conquer(int[] arr, int low, int mid, int high) {

    int[] merge = new int[high - low + 1];

    int i = low;
    int j = mid + 1;
    int k = 0;

    // Compare both subarrays
    while (i <= mid && j <= high) {

        if (arr[i] < arr[j]) {
            merge[k++] = arr[i++];
        }
        else {
            merge[k++] = arr[j++];
        }
    }

    // Remaining elements of left subarray
    while (i <= mid) {
        merge[k++] = arr[i++];
    }

    // Remaining elements of right subarray
    while (j <= high) {
        merge[k++] = arr[j++];
    }

    // Copy merged elements back to original array
    for (int x = 0; x < merge.length; x++) {
        arr[low + x] = merge[x];
    }

    
}
   static void divide (int[] arr ,int low , int high){
        if (low>= high){
            return;
        }
        int mid = (low + high)/2;
        divide(arr, low, mid);
        divide(arr, mid+1, high);
        conquer(arr, low,mid , high);
        
    }
    public static void main(String[] args) {
       int [] arr = {23,12,53,32,63,21,14,01};
       divide(arr,0 , arr.length-1);
       for (int x : arr){
        System.out.print(x + " ");
       }
    }
}
