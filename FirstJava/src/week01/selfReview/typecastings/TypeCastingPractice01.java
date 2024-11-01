package week01.selfReview.typecastings;

public class TypeCastingPractice01 {
    public static void main( String[] args ) {
        // 자동 캐스팅 1. short -> int
        short shortDish = 10; // 작은그릇
        int intDish; // 큰그릇

        intDish = shortDish; // 작은그릇에 담은 데이터를 큰그릇에 옮김.
        System.out.println( "short -> int: " + intDish ); // 10

        // 자동 캐스팅 2.int -> long
        long longDish;
        intDish = 2147483647;
        longDish = intDish;
        System.out.println( "int -> long: " + longDish ); // 2147483647

        // 자동 캐스팅 3. long -> float
        longDish = 21474836489L;
        float floatDish = longDish;
        System.out.println( "long -> float: " + floatDish ); // 2.1474836E10

        // 자동 캐스팅 4. float -> double
        floatDish = 3.1415921753f;
        double doubleDish = floatDish;
        System.out.println( "float -> double: " + doubleDish ); // 3.141592264175415
    }
}
