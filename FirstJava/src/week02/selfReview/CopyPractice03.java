package week02.selfReview;

import java.util.Arrays;

public class CopyPractice03 {
    public static void main(String[] args) {
        // 2차원 이상의 deep copy 복습코드
        // 배열원소는 1~100 사이의 난수이다.

        int[][] intArray = new int[5][5];
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = (int) (1 + Math.random() * 100);
            }
        }

        System.out.println("--- 원본 배열 출력 ---");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.printf("%d ", intArray[i][j]);
            }
            System.out.println();
        }

        // 1) clone() 함수로 원본배열을 복사해보자.
        System.out.println("\nclone()");
        int[][] copiedArray = intArray.clone();
        copiedArray[0][0] = 363;
        copiedArray[1][0] = 364;
        copiedArray[2][0] = 365;

        System.out.println("--- clone() 이후 원본배열 출력결과 ---");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.printf("%d ", intArray[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n--- copiedArray 배열 출력결과 ---");
        for (int i = 0; i < copiedArray.length; i++) {
            for (int j = 0; j < copiedArray[i].length; j++) {
                System.out.printf("%d ", copiedArray[i][j]);
            }
            System.out.println();
        }

        // 2) Arrays.copyOf 함수로 원본배열을 복사해보자.
        System.out.println("\nArrays.copyOf()");
        int[][] copiedArray2 = Arrays.copyOf(intArray, intArray.length);
        copiedArray2[0][0] = 366;
        copiedArray2[1][0] = 367;
        copiedArray2[2][0] = 368;

        System.out.println("--- Arrays.copyOf() 이후 원본배열 출력결과 ---");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.printf("%d ", intArray[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n--- copiedArray2 배열 출력결과 ---");
        for (int i = 0; i < copiedArray2.length; i++) {
            for (int j = 0; j < copiedArray2[i].length; j++) {
                System.out.printf("%d ", copiedArray2[i][j]);
            }
            System.out.println();
        }

        // 3) System.arraycopy 함수로 원본배열 복사해보기
        System.out.println("\nSystem.arraycopy()");
        int[][] copiedArray3 = new int [intArray.length][];
        System.arraycopy(intArray, 0, copiedArray3, 0, intArray.length );
        copiedArray3[0][0] = 369;
        copiedArray3[1][0] = 370;
        copiedArray3[2][0] = 371;
        System.out.println("--- Arrays.copyOf() 이후 원본배열 출력결과 ---");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.printf("%d ", intArray[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n--- copiedArray3 배열 출력결과 ---");
        for(int i =0; i< copiedArray3.length; i++) {
            for (int j = 0; j < copiedArray3[i].length; j++) {
                System.out.printf("%d ", copiedArray3[i][j]);
            }
            System.out.println();
        }

    }
}

/**
 * --- 원본 배열 출력 ---
 * 35 14 48 44 79
 * 22 19 55 60 77
 * 44 43 98 86 8
 * 84 17 39 85 38
 * 19 23 85 64 27
 *
 * clone()
 * --- clone() 이후 원본배열 출력결과 ---
 * 363 14 48 44 79
 * 364 19 55 60 77
 * 365 43 98 86 8
 * 84 17 39 85 38
 * 19 23 85 64 27
 *
 * --- copiedArray 배열 출력결과 ---
 * 363 14 48 44 79
 * 364 19 55 60 77
 * 365 43 98 86 8
 * 84 17 39 85 38
 * 19 23 85 64 27
 *
 * Arrays.copyOf()
 * --- Arrays.copyOf() 이후 원본배열 출력결과 ---
 * 366 14 48 44 79
 * 367 19 55 60 77
 * 368 43 98 86 8
 * 84 17 39 85 38
 * 19 23 85 64 27
 *
 * --- copiedArray2 배열 출력결과 ---
 * 366 14 48 44 79
 * 367 19 55 60 77
 * 368 43 98 86 8
 * 84 17 39 85 38
 * 19 23 85 64 27
 *
 * System.arraycopy()
 * --- Arrays.copyOf() 이후 원본배열 출력결과 ---
 * 369 14 48 44 79
 * 370 19 55 60 77
 * 371 43 98 86 8
 * 84 17 39 85 38
 * 19 23 85 64 27
 *
 * --- copiedArray3 배열 출력결과 ---
 * 369 14 48 44 79
 * 370 19 55 60 77
 * 371 43 98 86 8
 * 84 17 39 85 38
 * 19 23 85 64 27
 */
