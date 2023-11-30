package chap_07.camera;

public final class ActionCam extends Camera {
    public final String lens; // = "광각렌즈";
    // final 어디에서도 값을 바꿀수 없다.
    public ActionCam() {
        super("액션 카메라");
        lens = "광각 렌즈";
    }

    public final void makeVideo() {
        System.out.println(this.name + " : " +this.lens + "멋진 비디오를 제작합니다.");
    }
}
