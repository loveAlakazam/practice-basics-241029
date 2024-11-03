package week02.selfReview;

public class WhileIters {
    public static void main(String[] args) {
        // while 문
        System.out.println("while");
        int number = 0;
        while(number < 5) {
            System.out.println(number++ + " 출력");
        }

        // do-while문
        number = 0;
        System.out.println("do-while");
        do {
            System.out.println(number++ + "출력");
        } while(number < 5);

    }
}
