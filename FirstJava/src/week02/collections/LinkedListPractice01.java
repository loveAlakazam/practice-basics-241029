package week02.collections;

import java.util.LinkedList;

public class LinkedListPractice01 {
    public static void main(String[] args) {
        // linkedList
        // 메모리에 남는 공간을 요청해서 여기저기 나눠서 실제값을 담는다.
        // 실제값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조.
        // 기본적인 기능인 ArrayList와 동일하지만
        // LinkedList는 값이 나눠져있어서 조회속도는 느리지만, 값추가/값삭제할때는 빠르다.
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(5);
        linkedList.add(15);
        linkedList.add(25);

        System.out.println(linkedList.get(0)); // 5
        System.out.println(linkedList.get(1)); // 15
        System.out.println(linkedList.get(2)); // 25
        System.out.println(linkedList.toString()); // [5, 15, 25]

        // add
        linkedList.add(100);
        System.out.println(linkedList.toString()); // [5, 15, 25, 100]

        linkedList.add(2,50);
        System.out.println(linkedList.toString()); // [5, 15, 50, 25, 100]

        // set
        linkedList.set(2, 20);
        System.out.println(linkedList.toString()); // [5, 15, 20, 25, 100]

        // remove
        linkedList.remove(4);
        System.out.println(linkedList.toString()); // [5, 15, 20, 25]

        // clear
        linkedList.clear();
        System.out.println(linkedList.toString()); // []





    }
}
