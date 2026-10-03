package Day12;

public class palindromeString {
    static boolean palindrome(String s , int left , int right){
        s=s.toLowerCase();
        
        if(left >= right){
            return true;
        }
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        return palindrome(s, left+1,right-1);

    }
    public static void main(String[] args) {
        String s = "Madam";
        System.out.println(palindrome(s, 0, s.length()-1));
    }
}
