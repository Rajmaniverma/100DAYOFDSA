package Day6;

public class Insertionsort {
    void Insertion(int[] arr){
        int len = arr.length;

        for(int i = 1; i < len; i++){
            int tar = arr[i]; //tar = 3
            int j = i - 1;

            while(j >= 0 && arr[j] > tar){ //
                arr[j + 1] = arr[j];  //
                System.out.println("pre :" +  j);
                j--;
                System.out.println("post :" + j);
            }

            arr[j + 1] = tar; // insert   
        }

        for(int each : arr){
            System.out.print(each + " ");
        }
    }

    public static void main(String[] args) {
        Insertionsort it = new Insertionsort();
        int[] arr = {7,3,4,2,1,8};
        it.Insertion(arr);
    }
}