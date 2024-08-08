package ch6.sec03.exam04;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("car1.company: " + car1.company);
        System.out.println();

        Car car2 = new Car("k7");
        System.out.println("car2.model: " + car2.model);
        System.out.println();

        Car car3 = new Car("k100", "grey");
        System.out.println("car3.model: " + car3.model);
        System.out.println("car3.color: " + car3.color);
        System.out.println();

        Car car4 = new Car("k9", "black", 200);
        System.out.println("car3.model: " + car4.model);
        System.out.println("car3.color: " + car4.color);
        System.out.println("car3.maxSpeed" + car4.maxSpeed);
        System.out.println();
    }
}
