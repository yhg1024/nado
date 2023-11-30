package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 조건 : 키가 120 이상인 경우에만 탑승 가능
        // 삼항 연산자 이용
        // 키가 115cm 이므로 탑승 불가능합니다
        // 키가 121cm 이므로 탑승 가능합니다

        int height = 121;
        String result = (height >= 120) ? "탑승 가능합니다." : "탑승 불가능합니다.";
        System.out.println("키가 " + height + "cm 이므로" + result);

    }
}
