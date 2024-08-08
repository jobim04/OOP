package ch6.sec04.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        Computer myComputer = new Computer();

        int[] values1 = {1, 2, 3, 4};
        int result1 = myComputer.sum1(values1);
        System.out.println("result1: " + result1);

        int[] values2 = {1, 2, 3, 4};
        int result2 = myComputer.sum2(values2);
        System.out.println("result2: " + result2);
    }
}
