package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

// java.time.LocalDate : 날짜
// java.time.LocalTime : 시간
// java.time.LocalDateTime :날짜/시간

public class LocalDateEx2 {

  public static void main(String[] args) {
    // 오늘날짜
    LocalDate today = LocalDate.now();
    // 현재시간
    LocalTime now = LocalTime.now();

    System.out.println(today); // 2024-02-22
    System.out.println(now); // 15:01:20.782321200
    System.out.println("윤년 / 평년 : " + today.isLeapYear()); // 평년 true

    // 특정 날짜 지정
    LocalDate birth = LocalDate.of(1950, 11, 23);
    LocalTime birthTime = LocalTime.of(23, 11, 58);

    // 날짜 덧셈
    System.out.println(birth.plusDays(1));
    System.out.println(birth.minusDays(1));

    LocalDateTime date = LocalDateTime.now();
    System.out.println(date); //2024-02-22T15:10:07.378241600 (ISO-8601)
    System.out.println(date.getHour());
    System.out.println(date.getMinute());
    System.out.println(date.getSecond());
    System.out.println(date.getYear());
    System.out.println(date.getMonth()); // FEBRUARY 2 월
    System.out.println(date.getMonth().getValue()); // 2월
    System.out.println(date.getDayOfMonth());
    System.out.println();
  }
}
