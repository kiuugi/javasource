package exam;

import java.time.LocalDateTime;

public class Board {

  // 게시판
  // 번호, 제목, 내용, 작성자, 작성날짜, 수정날짜
  private int number;
  private String title;
  private String content;
  private String writer;
  private LocalDateTime regDate;
  private LocalDateTime lastModifedDate;

  public Board() {}

  public Board(int number, String taitle, String content, String writer) {
    this.number = number;
    this.title = taitle;
    this.content = content;
    this.writer = writer;
  }
}
