package week02.selfReview;

import java.util.Arrays;

public class ArrayReview01 {
    public static void main(String[] args) {

        int[] intArray = new int[5];

        /**
         * intArray의 주소값: [I@372f7a8d
         */
        System.out.println("intArray의 주소값: " + intArray);

        // 반복을 활용하여 배열의 값을 조회한다.
        /**
         * 초기 intArray[0]값: 0
         * 초기 intArray[1]값: 0
         * 초기 intArray[2]값: 0
         * 초기 intArray[3]값: 0
         * 초기 intArray[4]값: 0
         */
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("초기 intArray[" + i + "]값: " + intArray[i]);
        }

        // 배열의 모든원소의 초기값을 10으로 변경한다 (0 -> 10)
        /**
         * 변경된 intArray[0]값: 10
         * 변경된 intArray[1]값: 10
         * 변경된 intArray[2]값: 10
         * 변경된 intArray[3]값: 10
         * 변경된 intArray[4]값: 10
         */
        Arrays.fill(intArray, 10);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("변경된 intArray[" + i + "]값: " + intArray[i]);
        }
    }
}
