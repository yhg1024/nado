package chap_01;

public class _Quiz_01 {
    //버스 도착 정보
    //버스 번호는 "1234", "상암08"과 같은 형태
    //남은 시간은 분 단위(예:3분, 5분)
    //남은 거리는 km 단위(예: 1.5km, 0.8km)

   /* 실행 결과
    상암08번 버스
    약 3분 후 도착
    남은 거리 1.2km */

    public static void main(String[] args) {
        //버스 번호 (123, 상암 08)
        String busNo = "상암08";

        //남은 시간 (3분, 5분)
        int min = 3;

        //남은 거리 (1.5km, 0.8km)
        double distance = 1.2;
        
        //결과 출력
        System.out.println(busNo + "번 버스");
        System.out.println("약 " + min + "분 후 도착");
        System.out.println("남은 거리" + distance + "km");
    }
}
