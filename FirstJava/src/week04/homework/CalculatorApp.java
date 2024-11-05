package week04.homework;

import java.util.Scanner;


/**
 * 우리의 계산기를 실행시켜주는 클래스
 */
public class CalculatorApp {
    public static boolean start() throws Exception {
        try {
            Parser parser = new Parser();
            Scanner scanner = new Scanner( System.in );

            System.out.println( "첫번째 숫자를 입력해주세요!" );
            String firstInput = scanner.nextLine();
            parser.parseFirstNum( firstInput );

            System.out.println( "연산자를 입력해주세요!" );
            String operator = scanner.nextLine();
            parser.parseOperator( operator );


            System.out.println( "두번째 숫자를 입력해주세요!" );
            String secondInput = scanner.nextLine();
            parser.parseSecondNum( secondInput );

            System.out.println( "연산결과: " + parser.executeCalculator() );
            return true;
        } catch ( Exception e ) {
            // Exception 은 모든 예외클래스의 부모클래스이다.
            // try 문에서 발생한 예외는 catch 블록에서 예외처리를 하며
            // BadInputException으로 감싼다.

            throw e;
        }

    }
}
