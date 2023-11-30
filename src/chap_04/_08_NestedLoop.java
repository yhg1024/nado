package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 별 (*) 사각형 만들기

        /*
         *****
         *****
         *****
         *****
         *****
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("삼각형 별");
        // 별 (*) 왼쪽 삼각형 만들기

        /*

         *
         **
         ***
         ****
         *****
         */

        // 나도 코딩
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 혼공자
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j == i) {
                    System.out.println();
                }
            }
        }


        System.out.println("오른쪽 삼각형 별");
        /*
             *
            **
           ***
          ****
         *****
        */


        // 나도코딩
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // 혼공자
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        System.out.println(" 트리 ");
        // 트리
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
