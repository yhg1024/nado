package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try{
            // System.out.println(3 / 0); // ArithmeticException

            // int[] arr = new int[3];
            // arr[5] = 100; // ArrayIndexOutOfBoundsException 인덱스 밖으로 벗어남

            // Object obj = "test";
            // System.out.println((int) obj); // ClassCastException 형변환 실패

            // String s = null;
            // System.out.println(s.toLowerCase());

            // Exception 모든 예외들의 조상클래스
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // 두개의 예외를 한꺼번에 쓰기 위해 사이에 | 쓰기
            System.out.println("뭔가 잘못 계산을 하셨네요.");
        //} catch (ArrayIndexOutOfBoundsException e) {
        //    System.out.println("인덱스를 잘못 설정했어요.");
        } catch (ClassCastException e){
            System.out.println("잘못된 형 변환입니다.");
        } catch (Exception e) {
            System.out.println("그 외의 모든 에러는 여기서 처리가 돼요.");
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
