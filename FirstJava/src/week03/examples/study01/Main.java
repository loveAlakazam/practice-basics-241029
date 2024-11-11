package week03.examples.study01;

public class Main {
    public static void main(String[] args) {
        /**
            // 생성자 호출.

            Car car1 = new Car();
            Car[] carArray = new Car[3];

            // car1
            car1.changeGear('P'); // 기어상태 P
            carArray[0] = car1;

            // car2
            Car car2 = new Car();
            car2.changeGear('N');
            carArray[1] = car2;

            // car3
            Car car3 = new Car();
            car3.changeGear('D');
            carArray[2] = car3;

            for(Car car:carArray) {
                System.out.println("car.gear: "+ car.gear);
            }
         */

        // 객체 생성
        Car car = new Car();

        // 초기값과 기본값 확인하기
        System.out.println("car.model: "+ car.model); // Gv80 으로 초기값
        System.out.println("car.color: "+ car.color); // null
        System.out.println();

        System.out.println("car.speed: "+ car.speed); // 0.0
        System.out.println("car.gear: "+ car.gear); // char의 기본값(\u0000 = 공백) 출력
        System.out.println("car.lights: "+ car.lights); // false
        System.out.println();

        System.out.println("car.tire: "+ car.tire); // 생성한 Tire의 인스턴스 주소값 ( tire = new Tire())
        System.out.println("car.door: "+ car.door); // null
        System.out.println();

        // 필드 사용
        car.color = "black"; // color: null => black
        car.speed = 100; // speed: 0.0 => 100.0
        car.lights = false; // lights: false => false
        System.out.println("car.color: "+ car.color); // black
        System.out.println("car.speed: "+ car.speed); // 100.0
        System.out.println("car.lights: "+ car.lights); // false


    }
}
