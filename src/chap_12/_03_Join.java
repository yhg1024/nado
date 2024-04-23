package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        try {
            // 스레드가 종료 될 떄까지 기다렸다가 다음 줄 실행
            thread.join(2500); // 2.5초까지 기다렸다가 실행
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cleanByBoss();
    }

    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");
            try {
                // 1초동안 멈춤
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
