package week02.selfReview;

public class NumberTransfer {
    public static void main(String[] args) {
        short shortValue = 1;
        short shortResult;
        int intResult;

        short x = 10;
        int y = 20;


        shortResult = (short)(x + y);

        int intValue = 10;


        long longValue = 20L;
        float floatValue = 1.234f;

        long longResult = intValue + longValue; // 더 넓은 범위의 변수로 저장됨.
        longResult = (long)(intValue / floatValue * longValue);
    }
}
