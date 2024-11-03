package week02.selfReview;

public class ForIters {
    public static void main(String[] args) {
        // 2의 제곱수 나타내기
        // 배열 초기화 - int 배열의 각 열의 초기값은 모두 기본값 0을 저장한다.
        int[] intArr = new int[11];

        intArr[0] = 1;
        for (int i = 1; i < intArr.length; i++) {
            intArr[i] = 2 << (i-1);
        }

        System.out.println("향상된 for문으로 2^0~2^10 까지의 값을 조회");
        for(int item : intArr) {
            System.out.println(item);
        }

        System.out.println("일반 for문으로 2^0~2^10 까지의 값을 조회");
        for(int i = 0 ; i< intArr.length ; i++) {
            System.out.printf("2의 %d 제곱값은 %d 입니다.\n", i, intArr[i]);
        }
    }
}
