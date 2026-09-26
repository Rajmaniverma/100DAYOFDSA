package Day5;

public class Bubblesort {
    static void Bubble(int [] arr ){
        int n= arr.length - 1;
    for(int i = 1 ; i<n; i++){
        for(int j =0 ; j<=n-i-1;j++){
           if(arr[j]>arr[j+1]){
             int temp = arr[j];
             arr[j] = arr[j+1];
             arr[j+1] = temp;
           }
        }
    }
    }
    public static void main(String[] args) {
        int [] arr = {5,2,1,9,3,6,4,0,8,7};
        Bubble(arr);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
