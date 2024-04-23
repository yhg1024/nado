package chap_12.clean;

public class Room {
    public int number = 1;
    // synchronized 동기화, 작업중인 쓰레드에는 진입을 막는다.
    synchronized public void clean(String name) {
        // 직원1 : 3번방 청소 완료
        System.out.println(name + " : " + number + "번방 청소 중");
        number++;
    }
}
