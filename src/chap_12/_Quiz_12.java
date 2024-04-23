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
public class _Quiz_12 {
    public static void main(String[] args) {

        Runnable productA =() -> {
            for (int i = 1; i <= 5; i++) {
                product("A");
            }
            System.out.println("-- A 상품 준비 완료 --");
        };
        Runnable productB =() -> {
            for (int i = 1; i <= 5; i++) {
                product("B");
            }
            System.out.println("-- B 상품 준비 완료 --");
        };

        Thread packing1 = new Thread(productA);
        Thread packing2 = new Thread(productB);

        packing1.start();
        packing2.start();
    }

    static synchronized public void product(String name) {
        int productNumber = 1;

        System.out.println(name + " 상품준비 " + productNumber + "/5");

        productNumber++;
    }


}
