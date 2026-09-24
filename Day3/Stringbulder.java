package Day3;

public class Stringbulder {
    public static void main(String[] args) {
        String s = "hello world";
        int a = 123;
        String s1 = String.valueOf(a);
        System.out.println(s);
        // 1st
        StringBuilder sb = new StringBuilder(s);
        
        sb.append("  is good");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.setCharAt(0, 'y');
        System.out.println(sb);
        System.out.println(sb.charAt(1));
        System.out.println(sb.length());
        System.out.println(sb.append(s1 ));
        System.out.println(sb.insert(2 , "u"));
        System.out.println(sb.delete(1,4 ));
        System.out.println(sb.deleteCharAt(1));
        System.out.println(sb.replace(1,4 , "hell0"));
        
    }
}
