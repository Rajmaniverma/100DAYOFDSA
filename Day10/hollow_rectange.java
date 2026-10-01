package Day10;

public class hollow_rectange {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 6; j++) {

                if (i == 0 || i == 4 || j == 0 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            System.out.println();
        }
    }
}