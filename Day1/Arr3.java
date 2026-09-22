package Day1;

public class Arr3 {
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        // Passing an anonymous array directly to a method parameter
        printArray(new int[]{5, 10, 15, 20}); 
    }
}
