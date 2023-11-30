package chap_10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 (필터링) 생성
        // Arrays.stream 배열에서 스트림
        int[] scores = {100, 95, 90, 85, 80};
        // Arrays import 단축키 alt + enter
        // 단축키 ctrl + alt + v = stream이 노란줄이었다. stream 객체를 받아오기 위해
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langStream = Arrays.stream(langs);

        // Collection.stream()
        List<String> langList = new ArrayList<>();
        // langList.add("python");
        // langList.add("java");

        // 자동으로 langList.add를 해주는것과 같다.
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
        // System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        // Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");

        // 스트림 사용
        // 중간 연산(Intermediate Operation) 중간 필터링, 여러번 가능 : filter, map, sorted, distinct, skip, ...
        // 최종 연산(Terminal Operation) 최종적 결과물, 한번만 가능 : count, min, max, sum, forEach, anyMatch, allMatch,...

        // 90점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >=90).forEach(x -> System.out.println(x));
        // 클래스명::메소드명 - :: 콜론으로 구분하면 앞에서 넘어오는 데이터가 자동으로 들어가서 위와 똑같이 동작한다.
        // Arrays.stream(scores).filter(x -> x >=90).forEach(System.out::println);
        System.out.println("---------------------------------------------------------------");

        // 90점 이상인 사람의 수
        int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("------------------------------------------------------------------");

        // 90점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("--------------------------------------------------------------------------");

        // 90점 이상인 점수들을 정렬 : sorted
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("------------------------------------------------------------------");

        // "python", "java", "javascript", "c", "c++", "c#"
        // c로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------------");

        // java라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
        System.out.println("------------------------------------------------------------------");

        // 4글자 이하의 언어를 정렬해서 출력
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("---------------------------------------------");

        // 4글자 이하의 언어 중에서 c라는 글자를 포함하는 언어
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c")).forEach(System.out::println);
        System.out.println("-----------------------------------------------");

        // 4글자 이하의 언어 중에서 c라는 글자를 포함하는 언어가 하나라도 있는지 여부
        boolean anyMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);
        System.out.println("-----------------------------------------------");

        // 4글자 이하의 언어들은 모두 c라는 글자를 포함하는지 여부
        boolean allMatch = langList.stream()
                .filter(x -> x.length() <= 3)
                .allMatch(x -> x.contains("c"));
        System.out.println(allMatch);
        System.out.println("-----------------------------------------------");

        // 4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 함께 출력
        // map : 우리가 사용하는 데이터를 원하는 형태로 가공하거나 데이터 중에서 꺼내고싶은 인스턴스 변수를 지정해주는 역할
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .map(x -> x + " (어려워요)")
                .forEach(System.out::println);
        System.out.println("---------------------------------------------");
        
        // c라는 글자를 포함하는 언어를 대문자로 출력
        langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("-------------------------------------------");
        
        // c라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        List<String> langListStartWithC = langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        langListStartWithC.stream().forEach(System.out::println);
        System.out.println("-------------------------------------------");
    }
}
