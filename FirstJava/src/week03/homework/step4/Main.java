package week03.homework.step4;

public class Main {
    public static void main( String[] args ) {
        Calculator03 cal = new Calculator03();

        int num1 = 295;
        int num2 = 327;
        String operator = "+";
        double result = cal.calculate( operator, num1, num2 );

        // 295+327= 622.0
        System.out.println(num1+ operator + num2 + "= "+ result);

        num1 = 431;
        num2 = 7;
        operator = "*";
        // 431*7= 3017.0
        result = cal.calculate( operator, num1, num2 );
        System.out.println(num1+ operator + num2 + "= "+ result);

        operator = "/";
        // 431/7= 61.57142857142857
        result = cal.calculate( operator, num1, num2 );
        System.out.println(num1+ operator + num2 + "= "+ result);

        num1 = 42;
        num2 = 8;
        operator = "%";
        // 42%8= 2.0
        result = cal.calculate( operator, num1, num2 );
        System.out.println(num1+ operator + num2 + "= "+ result);
    }


}
