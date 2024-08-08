package ch6.sec03.exam04;

//다른 생성자를 호출해서 중복 코드 줄이기

// this()는 Car()과 같다.
public class Car {
    //필드
    String company = "kia";
    String model;
    String color;
    int maxSpeed;

    //생성자
    Car() {
    }

    Car(String model) {
        this(model, "은색", 250);
    }

    Car(String model, String color) {
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}