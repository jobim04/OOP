package scrach;

import java.util.Calendar;

public class temp {
    public static void main(String[] args) {
        //Calander를 이용해서 오늘의 요일을 얻고 나서 Week 열거 타입 변수 today에 해당 열거 상수를 대입하는 예제

        Week today = null; //열거 타입 변수 today 선언

        Calendar now = Calendar.getInstance();

        int hoy = now.get(Calendar.DAY_OF_WEEK); 

        switch(hoy) {
            case 1 :
                today = Week.DOMINGO; break;
            case 2:
                today = Week.LUNES; break;
            case 3:
                today = Week.MARTES; break;
            case 4:
                today = Week.MIÉRCOLES; break;
            case 5:
                today = Week.VIERNES; break;
            case 6:
                today = Week.JUEVES; break;
            case 7:
                today = Week.SÁBADO; break;
        }

        System.out.println("Hoy es el " + today + ".");
    }
}
