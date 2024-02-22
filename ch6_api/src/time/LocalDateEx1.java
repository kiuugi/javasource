package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 날짜/시간 객체
// 처음부터 제공되던 클래스 => 단점 존재
// 1.8 => java.time 패키지 추가
public class LocalDateEx1 {

  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date); // Thu Feb 22 14:36:53 KST 2024

    SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
    System.out.println(sdf.format(date)); // 24-02-22

    Calendar calendar = Calendar.getInstance();
    System.out.println("년도" + calendar.get(Calendar.YEAR));
    System.out.println("월(1~11), 0 : 1월" + calendar.get(Calendar.MONTH));
    System.out.println(
      "이달의 몇 째 주" + calendar.get(Calendar.WEEK_OF_MONTH)
    );
    System.out.println("이 달의 몇 일" + calendar.get(Calendar.DATE));
    System.out.println("이 달의 몇 일" + calendar.get(Calendar.DAY_OF_MONTH));
    System.out.println(
      "이번 년도의 몇번째 일" + calendar.get(Calendar.DAY_OF_YEAR)
    );
    System.out.println("현재 시간(0~11)" + calendar.get(Calendar.HOUR));
    System.out.println("현재 시간(0~23)" + calendar.get(Calendar.HOUR_OF_DAY));
    System.out.println("분" + calendar.get(Calendar.MINUTE));
    System.out.println("초" + calendar.get(Calendar.SECOND));
  }
}
