package chap_13;

public class _02_OutPut {
    public static void main(String[] args) {
        // System.out.format();
        // System.out.printf("");

        System.out.println("----------- 정수 ---------");
        // %d 정수 %n 줄바꿈
        System.out.printf("%d%n", 1); // 1
        System.out.printf("%d %d %d%n", 1, 2, 3); // 1 2 3
        System.out.printf("%d%n", 1234);
        // %6d 6자리의 공간을 확보하고 나서 1234 출력
        System.out.printf("%6d%n", 1234); // ______1234
        // 6자리의 공간 확보 후 1234 출력하는데 빈 공간은 0으로 채움
        System.out.printf("%06d%n", 1234); // 001234
        System.out.printf("%6d%n", -1234); // _-1234
        System.out.printf("%+6d%n", 1234); // _+1234 (항상 +- 기호 표시)
        // %,15d 15자리 공간을 확보하고 3자리마다 콤마로 구분
        System.out.printf("%,15d", 1234567890); // __1,234,567,890
        // %-6d 6자리의 공간을 확보하고 나서 왼쪽 정렬 1234 출력
        System.out.printf("%-6d%n", 1234); // 1234__ 안나옴



        System.out.println("------------ 실수 -----------------");
        // %f (floating-pint : 부동 소수점 형식
        System.out.printf("%f%n", Math.PI); // 3.141593
        // 소수점 둘째 자리까지 표시
        System.out.printf("%.2f%n", Math.PI); // 3.14
        // 6자리 공간 확보하고 소수점 둘째 자리
        System.out.printf("%6.2f%n", Math.PI); // __3.14
        // 왼쪽 정렬
        System.out.printf("%-6.2f%n", Math.PI); // 3.14__
        //빈 공간을 0으로 채우기
        System.out.printf("%06.2f%n", Math.PI); // 003.14
        // 항상 +- 기호 표시
        System.out.printf("%+6.2f%n", Math.PI); // _+3.14

        System.out.println("---------- 문자열 ------------");
        System.out.printf("%s%n", "Java"); // Java (일반 출력)
        System.out.printf("%6s%n", "Java"); // __Java (6자리 공간 확보하고 우측 정렬)
        System.out.printf("%-6s%n", "Java"); // Java__ (6자리 공간 확보하고 좌측 정렬)
        System.out.printf("%6.2s", "Java"); // ____Ja (6자리 공간 확보하고 우측 정렬해서 2글자 출력)
        System.out.printf("%-6.2s%n", "Java"); // Ja____ (JaJa로 나옴)

        System.out.println("--------- 응용1 -------------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호 " + 90 + " " + 80 + " " + 85.0); // 강백호 90 80 85.0
        System.out.println("서태웅 " + 100 + " " + 100 + " " + 100.0); // 서태웅 100 100 100.0
        System.out.println("채치수 " + 95 + " " + 100 + " " + 97.5); // 채치수 95 100 97.5

        System.out.println("---------- 응용2 -------------");
        System.out.println("이름      영어   수학   평균"); // 공백이 각각 6, 3, 3 칸으로 구분
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태웅", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "채치수", 95, 100, 97.5);

        System.out.println("---------- 참고 ---------");
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");
        System.out.println("가 나 다 라");

    }
}
