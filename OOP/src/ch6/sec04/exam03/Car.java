package ch6.sec04.exam03;

public class Car {
    //필드
    int gas;

    //메소드
    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if(gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }

    void run() {
        while(true) {
            if(gas > 0) {
                System.out.println("drive. (gas left: " + gas + ")");
                gas -= 1;
            } else {
                System.out.println("stop. (gas left: " + gas + ")");
                return;
            }
        }
    }
}
