package ch6.sec03.examFinish02;

public class Board {
    String title;
    String content;
    String writer;
    String date;
    int hitcount;

    Board(String title, String content) {
        this(title, content, "KimHyeokju", "20240806", 1);
    }

    Board(String title, String content, String writer) {
        this(title, content, writer, "20240806", 1);
    }

    Board(String title, String content, String writer, String date) {
        this(title, content, writer, date, 1);
    }

    Board(String title, String content, String writer, String date, int hitcount) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
        this.hitcount = hitcount;
    }
}
