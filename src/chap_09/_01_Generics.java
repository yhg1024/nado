package chap_09;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import static javax.xml.bind.DatatypeConverter.printDouble;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스 : 다양한 타입의 객체를 지원하는 클래스나 메소드를 정의하는 방법
        //  똑같은 동작을 하는 클래스나 메소드를 여러개 만들 필요없이
        // 제네릭스는 참조자료만 지원한다.
        //  딱 한번만 정의하고 여러타입에 지원
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDouble(dArray);
        printStringArray(sArray);

        System.out.println("------------------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }



    // T : type, K : key, V : value, E : Element <>
    // (사실 아무거나 써도 상관없다. 일반적으로 쓸뿐 쌍만 이루면된다.)
    private static <T> void  printAnyArray(T[] array) {
        for (T t :
                array) {
            System.out.print(t + " "); // 1 2 3 4 5
        }
        System.out.println();
    }

    private static void printDouble(Double[] dArray) {
        for (double d :
                dArray) {
            System.out.print(d + " "); // 1 2 3 4 5
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s :
                sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
        
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i :
                iArray) {
            System.out.print(i + " "); // 1 2 3 4 5
        }
        System.out.println();
    }
}
