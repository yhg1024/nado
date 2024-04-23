package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 하나의 프로세스 (Process) : 실행되어 돌아가고 있는 상태
        // 쓰레드 (Thread) : 프로세스의 자원을 통해 실제로 작업을 수행

        // 1 3 5 7 9
        // 2 4 6 8 10

        // cleanBySelf();
        CleanThread cleanThread = new CleanThread();
        // run메소드를 직접 호출하면 순차적으로 청소
        // cleanThread.run(); // 직원 청소
        // 쓰레드의 start메소드를 호출하면 동시에 청소
        cleanThread.start();

        cleanByBoss(); // 사장 청소
    }

    public static void cleanBySelf() {
        System.out.println("-- 혼자 청소 시작 --");
        for (int i = 1; i <= 10; i++) {
            System.out.println("(혼자) " + i + "번방 청소 중");
        }
        System.out.println("-- 혼자 청소 끝 --");
    }

    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
