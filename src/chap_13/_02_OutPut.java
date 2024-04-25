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
        System.out.printf("%+6d%n", 1234); // _+1234 (항상 기호 표시)
        // %,15d 15자리 공간을 확보하고 3자리마다 콤마로 구분
        System.out.printf("%,15d", 1234567890); // __1,234,567,890
        // %-6d 6자리의 공간을 확보하고 나서 왼쪽 정렬 1234 출력
        System.out.printf("%-6d%n", 1234); // 1234__
    }
}
