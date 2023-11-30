package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        // 구구단
        // 2 * 1 = 2
        // 2 * 2 = 4

        for (int n = 2; n < 10; n++) {
            for (int m = 1; m < 10; m++) {
                String mul = (n + " * " + m + " = " + n * m);
                System.out.println(mul);
            }
            System.out.println();

        }
    }
}
