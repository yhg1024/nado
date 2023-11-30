package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 (Primitive Date Types) : int, float, double, long, boolean, ...
        // 기본 자료형은 메소드를 가지지 않고
        // 소문자로 시작
        int[] i = new int[3];
        System.out.println(i[0]); // 0

        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        // 참조 자료형 (Non-Primitive, Reference Date Types) : String, Camera, FactoryCam, SpeedCamm, ...
        // 참조 자료형은 메소드를 가질 수도 있다.
        //  대문자로 시작
        String[] s = new String[3];
        System.out.println(s[0]); // null 값을 따로 지정하지 않으면 null로 들어간다.

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); // true

        ////////////////////////////////////////////////////
        System.out.println("--------------------------------------------------");
        // 기본 자료형일 땐 값이 복사된다.
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);

        System.out.println("----------------------------------");
        // 참조일 경우 가르키는 대상이 달라진다.
        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2 = c1;
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "고장난 카메라";
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println("-------------------------");
        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2 = null;
        System.out.println(c2.name);
    }

    public static void changeName(Camera camera) {
        camera.name = "잘못된 카메라";
    }
}
