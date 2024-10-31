package week02.collections;

import java.util.Stack;

public class StackPractice01 {
    // Stack
    // Last In First Out (LIFO)
    // 수직으로 값을 쌓아넣고, 넣었다가 뺀다
    // push, peek, pop
    // 최근저장된 데이터를 나열하고 싶거나, 데이터의 중복처리를 막고싶을 때 사용한다.
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>();

        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.push(40);
        intStack.push(50);

        System.out.println(intStack.toString()); // [ 10, 20, 30 , 40 , 50 ]

        // 다 지워질 때까지 출력하기
        // 출력: 50 << 맨나중에 들어간게 맨처음으로 나옴
        // 출력: 40
        // 출력: 30
        // 출력: 20
        // 출력: 10 << 맨처음에 들어간게 맨나중에 나옴
        while(!intStack.isEmpty()) {
            int item = intStack.pop();
            System.out.println("출력: "+ item);
        }

        // 다시 추가
        intStack.add(10);
        intStack.add(50);
        intStack.add(100);

        // peek - 꼭대기
        // [10, 50, 100]
        System.out.println(intStack.peek()); // 100

        // size - 스택크기
        System.out.println(intStack.size()); // 3


    }
}
