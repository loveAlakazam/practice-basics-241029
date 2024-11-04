package week03.homework.step4;

public class Calculator03 {
    private AbstractOperation operation;

    Calculator03() {
    }

    public double calculate(String operator,int firstNumber, int secondNumber ) {
        double result;
        switch(operator) {
            case "+":
                operation = new AddOperation();

            case "-":
                operation = new SubtractOperation();

            case "*":
                operation = new MultiplyOperation();

                break;
            case "/":
                operation = new DivideOperation();
                break;
            case "%":
                DivideOperation divideOperation = new DivideOperation();
                result = divideOperation.operateRest(firstNumber, secondNumber);
                return result;
            default:
                return 0.0;
        }

        return operation.operate(firstNumber, secondNumber);
    }
}
