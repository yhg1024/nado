package chap_09.coffee;

import chap_09.user.User;

public class CoffeeByUser <T extends User>{
    // 어떤 형태의 타입을 쓰던 User클래스를 상속한다.
    public T user;
    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
