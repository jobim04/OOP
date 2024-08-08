package ch6.sec04.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCarc = new Calculator();

        myCarc.powerOn();
        System.out.println();

        int result1 = myCarc.plus(100,11);
        System.out.println("myCarc.plus(100,11): " + result1);

        double result2 = myCarc.divide(100,25);
        System.out.println("myCarc.divide(100,25): " + result2);
        System.out.println();

        myCarc.powerOff();
    }
}
