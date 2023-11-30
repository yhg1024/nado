package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성하시오

        // 신발 사이즈는 250부터 295까지 5단위로 증가
        // 신발 사이즈는 총 10가지

        // 실행 결과 : 사이즈 250 (재고 있음)

        /*작성자 : 양형경*/

        int size = 250;
        int[] shoes = new int[10];

        for (int i = 0; i < shoes.length; i++) {
            shoes[i] = size;
            size = size + 5;
            System.out.println("사이즈 " + shoes[i] + " (재고 있음)");
        }

        System.out.println("--------------------------------------");

        /*작성자 : 나도코딩*/
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }
        for (int size1 : sizeArray) {
            System.out.println("사이즈 " + size1 + " (재고있음)");
        }

    }
}
