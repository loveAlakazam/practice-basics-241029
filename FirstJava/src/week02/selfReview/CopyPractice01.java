package week02.selfReview;

import java.util.Scanner;

public class CopyPractice01 {
    // 얕은 복사 복습코드
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열초기화
        String[] stringArray = new String[3];
        for (int i = 0; i < stringArray.length; i++) {
            String inputString = sc.nextLine();
            stringArray[i] = inputString;
        }

        // 원본배열 출력
        System.out.println("--- 원본배열 출력 ---");
        for (String str : stringArray) {
            System.out.println(str);
        }

        // 얕은복사
        System.out.println("--- 얕은복사 배열 출력 ---");
        String[] copyStringArray = stringArray;
        copyStringArray[1] = "When we move!";
        for(String str: copyStringArray) {
            System.out.println(str);
        }

        System.out.println("--- 얕은복사 이후 원본배열 출력 ---");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}

/**
 * [[ 출력 결과 ]]
 * --- input strings ---
 * tour chicago
 * beautiful revolution
 * say peace
 * --- 원본배열 출력 ---
 * tour chicago
 * beautiful revolution
 * say peace
 * --- 얕은복사 배열 출력 ---
 * tour chicago
 * When we move!
 * say peace
 * --- 얕은복사 이후 원본배열 출력 ---
 * tour chicago
 * When we move!
 * say peace
 */
