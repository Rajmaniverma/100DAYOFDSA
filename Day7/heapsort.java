import java.util.Arrays;

public class heapsort {

    // Heapify subtree rooted at index i
    static void heapify(int[] arr, int n, int i) {

        int largest = i;          // Assume root is largest
        int left = 2 * i + 1;     // Left child
        int right = 2 * i + 2;    // Right child

        // Check if left child is larger
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check if right child is larger
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {

            // Swap
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Heapify affected subtree
            heapify(arr, n, largest);
        }
    }

    static void heapSort(int[] arr) {

        int n = arr.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements one by one
        for (int i = n - 1; i > 0; i--) {

            // Move current maximum to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify remaining heap
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Before sorting: " + Arrays.toString(arr));

        heapSort(arr);

        System.out.println("After sorting:  " + Arrays.toString(arr));
    }
}