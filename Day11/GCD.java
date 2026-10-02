package Day11;

public class GCD {

    static int Greatestcd(int p, int q) {

        if (q == 0) {
            return p;
        }

        return Greatestcd(q, p % q);
    }

    public static void main(String[] args) {
        System.out.println(Greatestcd(24, 18));
    }
}