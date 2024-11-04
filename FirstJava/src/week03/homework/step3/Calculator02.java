package week03.homework.step3;

public class Calculator02 {
    private  AddOperation addOperation;
    private SubtractOperation subtractOperation;
    private MultiplyOperation multiplyOperation;

    private DivideOperation divideOperation;

    Calculator02() {
        this.addOperation = new AddOperation();
        this.subtractOperation = new SubtractOperation();
        this.multiplyOperation = new MultiplyOperation();
        this.divideOperation = new DivideOperation();
    }

    public double calculate(String operator,int firstNumber, int secondNumber ) {
        double result = 0.0;
        switch(operator) {
            case "+":
                result = addOperation.operate( firstNumber, secondNumber );
                break;
            case "-":
                result = subtractOperation.operate( firstNumber, secondNumber );
                break;
            case "*":
                result = multiplyOperation.operate( firstNumber , secondNumber );
                break;
            case "/":
                result = divideOperation.operate( firstNumber , secondNumber );
                break;
            case "%":
                result = divideOperation.operateRest( firstNumber, secondNumber);

        }
        return result;
    }
}
