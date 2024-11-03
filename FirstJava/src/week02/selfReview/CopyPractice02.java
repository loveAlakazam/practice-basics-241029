package week02.selfReview;

import java.util.Scanner;

public class CopyPractice02 {
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

        // 깊은 복사
        System.out.println("--- 깊은 복사 배열 출력 ---");
        String[] copyStringArray = stringArray.clone();
        copyStringArray[1] = "When we move!";
        for(String str: copyStringArray) {
            System.out.println(str);
        }

        System.out.println("--- 깊은 복사 이후 원본배열 출력 ---");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}

/**
 * [[ 출력 결과 ]]
 * --- input strings ---
 * when the sun shines again
 * everything's so grand
 * so many people
 *
 * --- 원본배열 출력 ---
 * when the sun shines again
 * everything's so grand
 * so many people
 *
 * --- 깊은 복사 배열 출력 ---
 * when the sun shines again
 * When we move!
 * so many people
 *
 * --- 깊은 복사 이후 원본배열 출력 ---
 * when the sun shines again
 * everything's so grand
 * so many people
 *
 */
