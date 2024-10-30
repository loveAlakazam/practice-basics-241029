package week01;

import java.util.Scanner;

public class MyCookRecipe {
    static Scanner sc;

    public static String inputString(String stringElement) {
        System.out.println(stringElement + "(을)를 입력해주세요: ");
        sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static double inputScore() {
        System.out.println("요리점수를 입력해주세요 (1~5점): ");
        sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public static void main(String[] args) {
        try {
            // 내가 좋아하는 요리제목 입력
            String title = inputString("요리제목");



            // 점수 입력
            double score =inputScore();
            if (score < 1 || score > 5) {
                throw new Error("1~5 사이의 숫자를 입력해주세요.");
            }

            // 10개문장 입력하기
            String[]  sentences = new String[10];
            for(int i = 0; i< 10; i++) {
                String inputStr = inputString((i+1)+"번째 문장");
                if(inputStr == "" && inputStr.length() ==0)
                    break;
                sentences[i] = inputStr;
            }

            // 정수점수 계산
            int recipeScore = (int) score;

            // 백분율점수 계산
            double recipeScorePercent = (score / 5.0) * 100;


            // 결과 출력
            System.out.println("[ " + title + " ]");
            System.out.printf("별점: %d (%.1f%%)\n",  recipeScore , recipeScorePercent);



            for(int i = 0 ; i< 10 ; i++) {
                if(sentences[i].length() == 0){
                    break;
                }

                System.out.printf("%d. %s\n", i+1, sentences[i]);

            }
        } catch (Exception error) {
            throw error;
        }

    }
}
