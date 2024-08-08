package ch6.sec03.examFinish02;

public class BoardExample {
    public static void main(String[] args) {
        Board board1 = new Board("Across THe SpiderVerse", "Miles meets his nemesis");
        System.out.println(board1.title);
        System.out.println(board1.content);
        System.out.println();

        Board board2 = new Board("I am legend", "Main character almost gaves up his life but gets lite meeting someone live", "idk");
        System.out.println(board2.title);
        System.out.println(board2.content);
    }
}
