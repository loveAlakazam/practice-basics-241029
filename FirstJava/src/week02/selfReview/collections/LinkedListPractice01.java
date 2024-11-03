package week02.selfReview.collections;

import java.util.ArrayList;

public class LinkedListPractice01 {
    public static void main(String[] args) {
        final int SIZE = 5;
        // 배열 - 정적배열 (데이터사이즈가 정해져있음)
        // 정적배열 초기화: {기본타입}[] {배열명} = new {기본타입}[크기];
        int[] intArray = new int[SIZE];
        double[] doubleArray = new double[SIZE];
        String[] stringArray = new String[SIZE];
        boolean[] booleanArray = new boolean[SIZE];
        char[] charArray = new char[SIZE];

        // 연결리스트 - 동적배열 (데이터사이즈가 정해져있지 않음)
        // 동적배열 초기화: ArrayList {리스트명} = new ArrayList<래퍼클래스명>();
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        ArrayList<String> stringArrayList = new ArrayList<String>();
        ArrayList<Double> doubleArrayList = new ArrayList<Double>();


        // 정수 정적배열/동적배열 에 SIZE개의 데이터를 초기화
        for (int i = 0; i < SIZE; i++) {
            int item = (int) (1 + Math.random() * 10);

            // 정적배열원소에 값변경
            intArray[i] = item;

            // 리스트에 데이터 추가
            intArrayList.add(item);
        }

        // 동적배열에 새로운 값 추가
        intArrayList.add(65);


        System.out.println("[정적 배열]");
        for (int item : intArray) {
            System.out.printf("[%d]", item);
        }
        System.out.println("\n정적배열 길이: "+ intArray.length); // 5
        System.out.println("--------");
        for(Integer item : intArrayList) {
            System.out.printf("[%d]", item);
        }
        System.out.println("\n동적배열 길이: "+ intArrayList.size()); // 6

    }
}
