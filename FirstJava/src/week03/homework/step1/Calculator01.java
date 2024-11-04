package week03.homework.step1;

public class Calculator01 {
    // Generator
    public Calculator01() {}

    private double add(int firstNumber, int secondNumber) {
        return firstNumber+secondNumber;
    }
    private double subtract(int firstNumber, int secondNumber) {
        return firstNumber-secondNumber;
    }

    private double multiply(int firstNumber, int secondNumber) {
        return firstNumber*secondNumber;
    }

    private double divide(int firstNumber, int secondNumber) {
        return ((double)firstNumber) / secondNumber;
    }

    /**
     * step2. 나머지 연산자(%) 를 수행할 수 있게 내부코드를 변경.
     * @param firstNumber - (double)
     * @param secondNumber - (int) 메소드 오버로딩이 가능할 수 있도록.... - 파라미터개수/ 파라미터타입에 따라 오버로딩이 될 수 있다.
     *                     - 그러나 리턴타입이 int더라도,  파라미터가 int, int 이면 오버로딩안됨.
     *                     - 파라미터의 종류가 다르게 해야됨
     * @return firstNumber % secondNumber => 나머지는 int 로 리턴하도록함.
     */
    private int divide(double firstNumber, int secondNumber) {
        return (int)(firstNumber % secondNumber);
    }
    /**
     * step1
     * 더하기 / 빼기 / 곱하기 / 나누기 연산을 수행할 수 있는 Calculator 클래스를 만듭니다.
     * - calculate 메소드는 전달받은 피연산자, 연산자를 사용하여 연산을 수행한다.
     * -
     * @param operator - (String) 연산자
     * @param firstNumber - (int) 피연산자1
     * @param secondNumber - (int) 피연산자2
     * @return result - (double) 결과값
     */
    public double calculate(String operator,int firstNumber, int secondNumber ) {
        double result = 0.0;
        switch(operator) {
            case "+":
                result = add( firstNumber, secondNumber );
                break;
            case "-":
                result = subtract( firstNumber, secondNumber );
                break;
            case "*":
                result = multiply( firstNumber , secondNumber );
                break;
            case "/":
                result = divide( firstNumber , secondNumber );
                break;
            case "%":
                result = divide((double) firstNumber, secondNumber);
            default:
                break;
        }
        return result;
    }
}
