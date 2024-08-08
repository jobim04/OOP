package ch6.sec03.examFinish01;
//생성자에서 필드를 외부에서 받은 값으로 초기화 할 수 있도록 클래스를 작성하시오
//Member user1 = new Member("홍길동", "hong");
public class Member {
    String name;
    String id;

    Member(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
