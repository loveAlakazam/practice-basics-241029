package week02.selfReview;
// 비트연산자

public class BitCalculates {
    public static void main(String[] args) {
        // << 연산자
        int result;

        // 5 = 101(2)
        // 5 << 1 : 1010(2) = 10 (5*2)
        result = 5 << 1;
        System.out.println("result: " + result);


        // 5 << 2 : 10100(2) = 20 (5*(2^2) = 5*4)
        result = 5 << 2;
        System.out.println("result: " + result);
        System.out.println("x << y 결과 => x * (2^y) 와 같다.");


        // >> 연산자
        // 15 = 1111(2)
        // 15 >> 1 : 0111(2) = 7 (15//(2^1) = 15//2 = 7)
        result = 15 >> 1;
        System.out.println("result: " + result);

        // 15 >> 2 : 0011(2) = 3 (15//(2^2) = 15//4 = 3)
        result = 15 >> 2;
        System.out.println("result: " + result);

        // 15 >> 3 : 0001(2) = 1 (15//(2^3)= 15//8 = 1)
        result = 15 >> 3;
        System.out.println("result: " + result);
        System.out.println("x >>  y 결과 => x // (2^y) 와 같다.");

    }
}
