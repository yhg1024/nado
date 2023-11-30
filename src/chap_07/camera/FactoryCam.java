package chap_07.camera;

// FactoryCam is a Camera.
public class FactoryCam extends Camera { // 자식 클래스

    public FactoryCam() {
        //this.name = "공장 카메라";
        super("공장카메라"); // 부모클래스의 생성자에 접근
    }
    public void recordVideo() {
        // 동영상 녹화
        super.recordVideo(); // 부모클래스에 있는 recordVideo에 있는 기능을 수행하고 밑에 내용 수행
        detectFire();
    }
    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }
}
