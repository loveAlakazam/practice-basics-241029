import java.util.Scanner;

public class ScannerBeginner {
    public static int charToInteger (char inputChar) {
        return inputChar;
    }
    public static char integerToAsciiChar (int inputNumber) {
        /*
        * char ch = (char) inputNumber;
        * return ch;
        * */
        return (char) inputNumber;
    }
    public static void main(String[] args) {
        // int -> char
//        Scanner sc = new Scanner(System.in);
//        int asciiNumber = sc.nextInt();
//
//        // int(큼 4) -> char(작음 2) 로 형변환
//        char ch = integerToAsciiChar(asciiNumber);
//        System.out.println(ch);

        // char -> int
        Scanner sc = new Scanner(System.in);
        char letter = sc.nextLine().charAt(0);
        int asciiNumber = (int) letter;
        System.out.println(asciiNumber);
    }
}
