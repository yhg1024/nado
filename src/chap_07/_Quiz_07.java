package chap_07;

public class _Quiz_07 {
    // 클래스를 이용하여 햄버거를 자동으로 만드는 프로그램을 작성하시오

    // 햄버거 종류는 햄버거, 치즈버거, 새우버거 3가지
    // 각 버거는 각각의 클래스로 생성
    // 버거 이름을 담기 위한 name 변수 정의
    // 재료 정보를 표시하는 cook() 메소드 정의
    // 공통 부분은 상속 및 메소드 오버라이딩 처리
    // 모든 클래스는 하나의 파일에 정의

    // 각 버거의 재료 정보
    // 햄버거 : 양상추, 패티, 피클
    // 치즈버거 : 양상추, 패티, 피클, + 치즈
    // 새우버거 : 양상추, 패티, 피클, + 새우


    public static void main(String[] args) {
        HamBurger[] hamBurgers = new HamBurger[3];
        hamBurgers[0] = new HamBurger();
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("-------------------------");
        for (HamBurger hamBurger : hamBurgers) {
            hamBurger.cook();
            System.out.println("-------------------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");


    }
}

// 메인 클래스와 같이 넣어서 작동이 안됐다...
// 메인에 넣었더니 static을 쓰라고 해서 완전 밖으로 뺐더니 작동한다.
class HamBurger {
    public String name;
    // 햄버거 클래스
    public HamBurger() {
        this("햄버거"); // 매개변수를 받는 생성자를 호출하면
    }
    // 모든 클래스에서 이용하는 매개변수를 받는 생성자
    public HamBurger(String name){
        this.name = name;
    }

    public void cook(){
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }

}

class CheeseBurger extends HamBurger{
    // 치즈버거 클래스
    public CheeseBurger() {
        super("치즈버거"); // 매개변수를 받는 생성자를 호출
    }

    public void cook() {
        super.cook();
        System.out.println("+ 치즈");
    }
}
class ShrimpBurger extends HamBurger {
    //새우버거 클래스
    public ShrimpBurger() {
        super("새우버거"); // 매개변수를 받는 생성자 호출
    }
    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }
}
