package ch6.sec04.exam06;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCarc = new Calculator();

        //정사각형의 넓이 구하기
        double result1 = myCarc.areaRectangle(10);

        //직사각형의 넓이 구하기
        double result2 = myCarc.areaRectangle(10, 20);

        System.out.println(result1);
        System.out.println(result2);
    }
}
