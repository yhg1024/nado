package chap_07.camera;

//SpeedCam is a Camera. (IS-A)
public class SpeedCam extends Camera { // 자식 클래스
    // extends 부모클래스 이름
    // 하나의 부모만 상속

    public SpeedCam() {
        // this.name = "과속단속 카메라";
        super("과속단속 카메라");
    }
    public void takePicture() {
        // 사진 촬영
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }
    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정 합니다.");
    }

    public void recognizeLicensePlate() {
        // 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override // annotation 컴퓨터에게 지금 오버라이딩 하는중이라고 알려주는거, 없어도 문제는 없다.
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }
}
