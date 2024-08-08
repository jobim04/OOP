package ch6.sec03.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car(); //생성자 선택
        System.out.println(car1.company);
        System.out.println();

        Car car2 = new Car("k3");
        System.out.println(car2.company);
        System.out.println(car2.model);
        System.out.println();

        Car car3 = new Car("k9", "red");
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println();

        Car car4 = new Car("k5", "white", 150);
        System.out.println(car4.company);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.maxspeed);
    }
}
