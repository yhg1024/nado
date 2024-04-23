package chap_12;
// A 상품 준비 1/5
// B 상품 준비 1/5
//      ...
// -- A 상품 준비 완료 --
// -- B 상품 준비 완료 --
// == 세트 상품 포장 시작 ==
// 세트 상품 포장 1/5
//      ...
// == 세트 상품 포장 완료 ==
public class _Quiz_12_1 {
    public static void main(String[] args) {

        Runnable productA = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("A 상품준비 " + i + "/5");
            }
            System.out.println("-- A 상품 준비 완료 --");
        };
        Runnable productB = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B 상품준비 " + i + "/5");
            }
            System.out.println("-- B 상품 준비 완료 --");
        };

        Thread thread1 = new Thread(productA);
        Thread thread2 = new Thread(productB);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Runnable productSet = () -> {
            System.out.println("== 세트 상품 포장 시작 ==");
            for (int i = 1; i <= 5; i++) {
                System.out.println("세트 상품 포장 " + i + "/5");
            }
            System.out.println("== 세트 상품 포장 완료 ==");
        };

        Thread threadSet = new Thread(productSet);
        threadSet.start();
    }
}
