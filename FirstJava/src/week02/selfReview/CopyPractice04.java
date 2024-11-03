package week02.selfReview;

import java.util.Arrays;

public class CopyPractice04 {
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

        // 1) clone() 함수로 배열을 복사해보자.
        System.out.println("\n--- clone() ---");
        int[][] copiedArray = new int [intArray.length][];
        for(int i = 0; i < intArray.length ; i++) {
            copiedArray[i] = intArray[i].clone();
        }
        copiedArray[0][0] = 363;
        copiedArray[1][0] = 364;
        copiedArray[2][0] = 365;

        System.out.println("--- 복사이후 원본배열 출력결과 ---");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.printf("%d ", intArray[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n--- 복사본 배열 출력결과 ---");
        for (int i = 0; i < copiedArray.length; i++) {
            for (int j = 0; j < copiedArray[i].length; j++) {
                System.out.printf("%d ", copiedArray[i][j]);
            }
            System.out.println();
        }


        // 2) Arrays.copyOf() 함수로 배열을 복사해보자.
        System.out.println("\n--- Arrays.copyOf() ---");
        int[][] copiedArray2 = new int [intArray.length][];
        for(int i = 0; i < intArray.length ; i++) {
            copiedArray2[i] = Arrays.copyOf(intArray[i], intArray[i].length);
        }
        copiedArray2[0][0] = 366;
        copiedArray2[1][0] = 367;
        copiedArray2[2][0] = 368;

        System.out.println("--- 복사이후 원본배열 출력결과 ---");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.printf("%d ", intArray[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n--- 복사본 배열 출력결과 ---");
        for (int i = 0; i < copiedArray2.length; i++) {
            for (int j = 0; j < copiedArray2[i].length; j++) {
                System.out.printf("%d ", copiedArray2[i][j]);
            }
            System.out.println();
        }

        // 2) System.arraycopy() 함수로 배열을 복사해보자.
        System.out.println("\n--- System.aaraycopy() ---");
        int[][] copiedArray3 = new int [intArray.length][];
        for(int i = 0; i < intArray.length ; i++) {
            copiedArray3[i] = new int[intArray[i].length];
            System.arraycopy(intArray[i], 0, copiedArray3[i],0, intArray[i].length);
        }
        copiedArray3[0][0] = 369;
        copiedArray3[1][0] = 370;
        copiedArray3[2][0] = 371;

        System.out.println("--- 복사이후 원본배열 출력결과 ---");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.printf("%d ", intArray[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n--- 복사본 배열 출력결과 ---");
        for (int i = 0; i < copiedArray3.length; i++) {
            for (int j = 0; j < copiedArray3[i].length; j++) {
                System.out.printf("%d ", copiedArray3[i][j]);
            }
            System.out.println();
        }
    }
}

/**
 * --- 원본 배열 출력 ---
 * 23 12 95 58 77
 * 67 49 17 8 79
 * 44 83 56 81 76
 * 36 81 58 58 52
 * 66 23 45 87 26
 *
 * --- clone() ---
 * --- 복사이후 원본배열 출력결과 ---
 * 23 12 95 58 77
 * 67 49 17 8 79
 * 44 83 56 81 76
 * 36 81 58 58 52
 * 66 23 45 87 26
 *
 * --- 복사본 배열 출력결과 ---
 * 363 12 95 58 77
 * 364 49 17 8 79
 * 365 83 56 81 76
 * 36 81 58 58 52
 * 66 23 45 87 26
 *
 * --- Arrays.copyOf() ---
 * --- 복사이후 원본배열 출력결과 ---
 * 23 12 95 58 77
 * 67 49 17 8 79
 * 44 83 56 81 76
 * 36 81 58 58 52
 * 66 23 45 87 26
 *
 * --- 복사본 배열 출력결과 ---
 * 366 12 95 58 77
 * 367 49 17 8 79
 * 368 83 56 81 76
 * 36 81 58 58 52
 * 66 23 45 87 26
 *
 * --- System.aaraycopy() ---
 * --- 복사이후 원본배열 출력결과 ---
 * 23 12 95 58 77
 * 67 49 17 8 79
 * 44 83 56 81 76
 * 36 81 58 58 52
 * 66 23 45 87 26
 *
 * --- 복사본 배열 출력결과 ---
 * 369 12 95 58 77
 * 370 49 17 8 79
 * 371 83 56 81 76
 * 36 81 58 58 52
 * 66 23 45 87 26
 */