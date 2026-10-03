package Day12;

public class Stringdata {

    static String removeChar(String str, char ch) {

        // Base case
        if (str.length() == 0) {
            return "";
        }

        // Get first character
        char current = str.charAt(0);

        // If current character is the character to remove
        if (current == ch) {
            return removeChar(str.substring(1), ch);
        }

        // Otherwise keep current character
        return current + removeChar(str.substring(1), ch);
    }

    public static void main(String[] args) {

        String s = "bannana";

        System.out.println(removeChar(s, 'a'));
    }
}