package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류 : 컴파일 오류, 런타임 오류 (에러 error, 예외 exception)

        // int i = "문자열"; - 컴파일 오류

        // S s = new S();
        // s.methodA(); - StackOverflowError : 자기자신을 계속 불러왔다.

        // S s = null; - NullPointerException

        try{
            System.out.println(3 / 0);// - / by zero

            // int[] arr = new int[3];
            // arr[5] = 100; - ArrayIndexOutOfBoundsException 인덱스 밖으로 벗어남

            // Object obj = "test";
            // System.out.println((int) obj); - ClassCastException 형변환 실패
        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}

