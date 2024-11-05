package week04.homework;


import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/**
 * - 유저의 입력을 받아서 구현한 계산기의 로직을 전환시켜주는 객체
 * - 우리는 유저의 입력을 String으로만 받아야한다.
 * - 입력받은 String을 숫자나 연산자로 변환하기 위해서는 꼭 예외처리를 해야한다.
 * - 해당 예외 처리를 위해서는 Pattern.match() 메소드가 필요함. 해당부분은 직접 검색해서 확인...^^
 * - Pattern.match() 메소드를 사용하기 위한 정규식표현은 코드 내에 제공.
 * - 예외는 이미 구현된 BadInputException 객체를 사용.
 * - 예외를 어디에 구현할지는 본인이 결정할 수 있음. 어디가 더좋을지 고민해보고 좋으 ㄴ위치에 구현하고 간단하게 주석으로 자기 생각을 표현
 */
public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";

    // 초기 해시셋으로 사용가능한 operator 지정
    private static final HashSet<String> ALLOWED_OPERATORS = new HashSet<>( Arrays.asList("+", "-", "*", "/") );

    private static final String NUMBER_REG = "^[0-9]*$";
    private final Calculator calculator = new Calculator();
    private boolean isMatch;

    private boolean matchRegexAndInputString(String inputString, String regex) {
        return Pattern.matches( regex, inputString );
    }
    public Parser parseFirstNum(String firstInput) throws BadInputException {
        // 구현1
        isMatch = matchRegexAndInputString( firstInput, NUMBER_REG );
        if(!isMatch) {
            throw new BadInputException("숫자");
        }
        int firstNumber = Integer.parseInt( firstInput );
        calculator.setFirstNumber( firstNumber );
        return this;
    }

    public Parser parseSecondNum(String secondInput) throws BadInputException{
        // 구현1
        isMatch = matchRegexAndInputString( secondInput, NUMBER_REG );
        if(!isMatch) {
            throw new BadInputException("숫자");
        }
        int secondNumber = Integer.parseInt( secondInput );
        calculator.setSecondNumber( secondNumber );
        return this;
    }
    public Parser parseOperator(String operationInput) throws BadInputException {
        // 구현1
        AbstractOperation operation;
        isMatch = matchRegexAndInputString( operationInput, OPERATION_REG );
        if(!isMatch) {
            throw new BadInputException("연산자( +, -, *, / )중 1개");
        }

        if(!ALLOWED_OPERATORS.contains( operationInput )) {
            throw new BadInputException( "연산자( +, -, *, / )중 1개" );
        }

        switch ( operationInput ) {
            case "+" -> operation = new AddOperation();
            case "-" -> operation = new SubtractOperation();
            case "*" -> operation = new MultiplyOperation();
            case "/" -> operation = new DivideOperation();
            default -> throw new BadInputException( "연산자( +, -, *, / 중 1개" );
        };

        calculator.setOperation( operation );
        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }

}
