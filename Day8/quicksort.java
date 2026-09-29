package Day8;

public class quicksort {

    static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int low = l - 1;

        for (int j = l; j < r; j++) {
            if (arr[j] < pivot) {
                low++;

                // swap arr[low] and arr[j]
                int temp = arr[low];
                arr[low] = arr[j];
                arr[j] = temp;
            }
        }

        // correct pivot swap
        low++;
        int temp = arr[low];
        arr[low] = arr[r];
        arr[r] = temp;

        return low;
    }

    static void sorted(int[] arr, int l, int r) {
        if (l < r) {
            int pivot = partition(arr, l, r);

            sorted(arr, l, pivot - 1);
            sorted(arr, pivot + 1, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};

        sorted(arr, 0, arr.length - 1);

        // print once after sorting
        for (int each : arr) {
            System.out.print(each + " ");
        }
    }
}