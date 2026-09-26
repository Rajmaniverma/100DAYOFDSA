package Day5;

public class Selectionsort {

    void selection(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int minIndex = i;

            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            // swap once after finding minimum
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for(int each : arr){
            System.out.print(each + " ");
        }
    }

    public static void main(String[] args) {
        Selectionsort sl = new Selectionsort();
        int[] arr = {7,6,5,4,3,2,1};
        sl.selection(arr);
    }
}