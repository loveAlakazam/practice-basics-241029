package week02.collections;

import java.util.HashMap;
import java.util.Map;

public class MapPractice01 {
    public static void main( String[] args ) {
        // Map: key - value 쌍
        // key라는 값으로 독립적으로 보장
        // Map -> HashMap, TreeMap
        Map<String, Integer> intMap = new HashMap<>();

        intMap.put( "One", 1 );
        intMap.put( "Two", 2 );
        intMap.put( "Three", 3 );
        intMap.put( "Three", 4 ); // duplicated
        intMap.put( "Three", 5 ); // duplicated

        /**
         * {
         *  One =1
         *  Two =2
         *  Three = 5
         * }
         */
        System.out.println(intMap.toString());

        for(String key : intMap.keySet()) {
            int value = intMap.get( key );
            System.out.println(key + "의 value: " + value);
        }

        // key 삭제 이전 나머지 values 출력
        System.out.println("삭제이전");
        for(Integer value : intMap.values()) {
            System.out.println(value);
        }
        // key 삭제
        System.out.println("삭제이후");
        intMap.remove( "One" );
        intMap.remove( "Two" );
        intMap.remove("Three");
        // key 삭제 이후 나머지 values 출력
        for(Integer value : intMap.values()) {
            System.out.println(value);
        }

        System.out.println("---");
        intMap.put("Four", 44);
        for(Integer value: intMap.values()) {
            System.out.println(value);
        }
        System.out.println("---");

        Map<String, Integer> intMap2 = new HashMap<>();
        intMap2.put( "first" , 1 );
        intMap2.put("second", 2);
        for(String key: intMap2.keySet()) {
            Integer value = intMap2.get( key );
            System.out.println("key: "+ key+" value: "+ value);
        }

    }
}
