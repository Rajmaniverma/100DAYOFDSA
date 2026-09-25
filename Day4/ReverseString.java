package Day4;

public class ReverseString {

    static void reverse(String s, int index) {

        // Base case
        if (index < 0) {
            return;
        }

        // Print current character
        System.out.print(s.charAt(index));

        // Recursive call
        reverse(s, index - 1);
    }

    public static void main(String[] args) {

        String s = "hello";

        reverse(s, s.length() - 1);
    }
}