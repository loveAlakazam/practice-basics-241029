package week03.homework.step4;

public class DivideOperation extends AbstractOperation{
    @Override
    double operate(int firstNumber, int secondNumber) {
        return ((double)firstNumber) / secondNumber;
    }

    int operateRest(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber;
    }
}
