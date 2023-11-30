package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try{
            // System.out.println(3 / 0); // ArithmeticException

            // int[] arr = new int[3];
            // arr[5] = 100; // ArrayIndexOutOfBoundsException 인덱스 밖으로 벗어남

            Object obj = "test";
            System.out.println((int) obj); // ClassCastException 형변환 실패

            // Exception 모든 예외들의 조상클래스
        } catch (ArithmeticException e) {
            System.out.println("뭔가 잘못 계산을 하셨네요.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스를 잘못 설정했어요.");
        } catch (ClassCastException e){
            System.out.println("잘못된 형 변환입니다.");
        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace();
        }
    }
}
