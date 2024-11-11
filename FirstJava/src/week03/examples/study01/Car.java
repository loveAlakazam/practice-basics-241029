package week03.examples.study01;

/**
 * 1. 만들려고 하는 설계도를 선언한다. - 클래스 선언
 * 2. 객체가 가지고 있어야할 속성(필드)을 정의한다
 * 3. 객체를 생성하는 방식을 정의한다 - 생성자
 * 4. 객체가 가지고 있어야할 행위(메서드)를 정의한다.
 */

public class Car {
    // 필드
    // 1) 고유 데이터 영역
    public String company; // 자동차 회사
    public String model = "Gv80"; // 자동차 모델
    public String color; // 자동차 색상
    public double price; // 자동차 가격

    // 2) 상태 데이터 영역
    public double speed; // 자동차 속력
    public char gear; // 자동차 기어상태 (P, R, N ,D)
    public boolean lights; // 자동차 조명상태

    // 3) 객체 데이터 영역 - 한객체안에 하위객체를 가질 수 있다.
    public Door door; // 도어
    public Handle handle; // 핸들
    public Tire tire = new Tire(); // 타이어


    // 생성자
    // 처음 객체가 생성될때(인스턴스화) 어떤 로직을 수행해야하며, 어떤 값이 필수값으로 들어와야하는지 정의
    public Car() {
        System.out.println("기본생성자 호출");
    } // 기본 생성자 (생략가능)

    // 메서드
    // gasPedal
    // input: kmh
    // output: speed
    public double gasPedal(double kmh) {
        speed =  kmh;
        return speed;
    }

    // breakPedal
    // input: x
    // output: speed
    public double breakPedal() {
        speed = 0;
        return speed;
    }

    // changeGear
    // input: gearType(char type)
    // output: gear
    public char changeGear(char gearType) {
        gear = gearType;
        return gear;
    }

    // onOffLight()
    // input: x
    // output: boolean
    public boolean onOffLight() {
        return !this.lights;
    }

    // horn()
    // input: x
    // output: x
    public void horn() {
        System.out.println("빵");
    }

}
