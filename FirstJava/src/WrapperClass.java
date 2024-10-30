import java.lang.reflect.Array;
import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {
        // (1) boolean
        // 변수를 선언해보자 => 타입 이름 = 값;
        boolean flag = true;

        boolean flag2;
        flag2 = false;

        final boolean final_flag = true;
//        final_flag = false; // wrong

        // (2) 문자형(char)
        char alpha1 = 'a';
        System.out.println(alpha1);

        // (3) 정수형
        // byte / short / int / long
        byte byteNumber = 127; // -127 ~ 127 (1 byte)
//        byteNumber =300;
        short shortNumber = 32767; // -32,768 ~ 32,767
        int intNumber = 2147483647;
        long longNumber = 2147483647L;

        System.out.println(byteNumber);
        System.out.println(shortNumber);
        System.out.println(intNumber);
        System.out.println(longNumber);

        // (4) 실수형 : float(4byte), double(8byte)
        float floatNumber = 0.1234F;
        double doubleNumber = 0.1234;

        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        // (5) 참조형
        // (5-1) 문자열 변수
        String str = "Hello world";
        System.out.println(str);

        // (5-2) 배열
        int [] a = { 1,2, 3};
        System.out.println(a); // 배열a의 주소값(a[0])
        System.out.println(Arrays.toString(a));

        // (5-3) 래퍼클래스
        int number = 21;
//        Integer numberClass = new Integer(number); // deprecated
        Integer numberClass = number;
        System.out.println(numberClass.intValue());



    }
}
