package week02.collections;

import java.util.HashSet;
import java.util.Set;

public class SetPractice01 {
    public static void main(String[] args) {
        // Set - 중복요소를 허용하지 않음.
        // 집합
        // 순서가 보장되지 않지만 중복이 없다.
        // Set은 HashSet과 TreeSet이 존재한다.
        // Set은 생성자가 없는 인터페이스라서 생성할 수 없다.
        // HashSet은 생성자가 잇어서 구현이 가능하다.\
        Set< Integer > intSet = new HashSet<>( );
        intSet.add( 1 );
        intSet.add( 2 );
        intSet.add( 3 );
        intSet.add( 3 );
        intSet.add( 2 );

        System.out.println(intSet.toString()); // [1,2,3]

        // 1
        // 2
        // 3
        for ( Integer item : intSet ) {
            System.out.println(item);
        }


        // contains
        System.out.println(intSet.contains( 5 )); // false
        System.out.println(intSet.contains( 1 )); // true
    }
}
