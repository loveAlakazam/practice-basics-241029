package week04.homework;

public class BadInputException extends Exception {
    public BadInputException(String type) {
        super( "잘못된 입력 입니다! " + type + "을 입력 해주세요!" );
    }
}
