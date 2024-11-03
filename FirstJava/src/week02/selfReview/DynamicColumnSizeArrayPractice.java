package week02.selfReview;

public class DynamicColumnSizeArrayPractice {
    public static void main(String[] args) {
        // 가변배열 복습코드
        int[][] sampleArr = new int [5][];

        for (int i = 0; i < sampleArr.length; i++) {
            sampleArr[i] = new int[i+1];
            for (int j = 0; j < sampleArr[i].length; j++) {
                sampleArr[i][j] = (int)(1+ 9 * Math.random());
            }
        }

        // 가변배열 출력
        System.out.println("-- 가변배열 출력 --");
        for (int i = 0; i < sampleArr.length; i++) {
            for (int j = 0; j < sampleArr[i].length; j++) {
                System.out.printf("%d ", sampleArr[i][j]);
            }
            System.out.println();
        }
    }
}

/**
 * [[ 출력 결과 ]]
 * -- 가변배열 출력 --
 * 6
 * 7 4
 * 4 8 4
 * 9 8 8 5
 * 7 4 6 8 6
 */