package week02.collections;

import java.util.ArrayList;

public class ArrayListPractice01 {
    public static void main(String[] args) {
        // List는 순서가 있는 데이터 집합 배열과 비슷하다
        // 배열은 최초길이를 알아야한다.
        // 일반배열은 배열은 정적배열이며 크기를 먼저 설정해야한다.
        // List(ArrayList) : 동적배열이며 크기가 가변적이다.
        // - 생성시점에 작은 연속된 공간을 요청해서 참조형 변수들을 담아놓는다.
        // - 값이 추가될때 더 큰 공간이 필요하면 더 큰 공간을 받아서 저장한다.

        // add() & get()
        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언+생성
        intList.add(11);
        intList.add(12);
        intList.add(13);
        intList.add(14);
        System.out.println(intList.get(2)); // 13

        // set(index, value)
        // 11 -> 15
        intList.set(0, 15);
        System.out.println(intList.get(0));

        // remove(index)
        // 12,13,14
        intList.remove(0);
        System.out.println(intList.get(0));

        // 리스트 전체값 삭제: clear()
        System.out.println("clear() 이전"+ intList.toString());
        intList.clear();
        System.out.println("clear() 이후"+ intList.toString());

    }
}
