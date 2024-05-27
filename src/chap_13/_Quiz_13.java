package chap_13;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class _Quiz_13 {
    // 퀴즈 내용은 saying.txt라는 이름의 파일로 제공
    // 퀴즈는 문제와 정답이 각각 한 줄로 구성 (퀴즈 3개인 경우 총 6줄)
    // 사용자로부터 값을 입력받아 정답여부 확인
    // 오답인 경우 정답 안내
    // 퀴즈 내용이 더이상 없을 때까지 반복
    public static void main(String[] args) {
//        String fileName = "saying.txt";
//        File file = new File(fileName);
//        try {
//            file.createNewFile();
//            if (file.exists()) {
//                System.out.println("파일이 존재합니다." + file.getAbsolutePath());
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("saying.txt", true))) {
//            bw.write("세 살 __ 여든까지 간다");
//            bw.newLine();
//            bw.write("버릇");
//            bw.newLine();
//            bw.write("소 잃고 ___ 고친다");
//            bw.newLine();
//            bw.write("외양간");
//            bw.newLine();
//            bw.write("천 리 길도 한 __부터");
//            bw.newLine();
//            bw.write("걸음");
//            bw.newLine();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        Scanner sc = new Scanner(System.in);

        System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)");
        System.out.println("-------------------------------------------------");

        try (BufferedReader br = new BufferedReader(new FileReader("saying.txt"))) {
            String line;
            while (true) {
                line = br.readLine();

                System.out.println("(문제)" + line);
                System.out.print(" 정답 입력 => ");
                String answer = sc.next();

                if (line == null) {
                    break;
                }

                if (Objects.equals(answer, line)) {
                    System.out.println("정답입니다!!");
                } else {
                    System.out.println("틀렸습니다. 정답은 " + line + "입니다.");
                }

                System.out.println();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
