package week04.homework;

public class Main {
    public static void main( String[] args ) {
        boolean calculatedEnded = false;
        // 구현2
        try{
            CalculatorApp calculatorApp = new CalculatorApp();
            calculatedEnded = calculatorApp.start();

            if(calculatedEnded) {
                System.out.println("계산기 프로그램을 종료합니다.");
            }
        } catch( Exception e) {
            // calculatorApp.start()에서는 Exception을 throws 한다고 명시한다지만
            // 실제로는 예외발생후에 BadInputException으로 감싸므로
            // 예외 로그 출력 : printStackTrace
            e.printStackTrace();

        }
    }
}
