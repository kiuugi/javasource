package lang;

public class StringEx5 {

  public static void main(String[] args) {
    System.out.println(count("12345AB12AB345AB", "AB"));
    System.out.println(count("12345", "AB"));
  }

  public static int count(String src, String target) {
    // src 에 target 문자가 몇 번 나오는 세어서 반환
    int cnt = 0, pos = 0;

    while ((pos = src.indexOf(target, pos)) != -1) {
      cnt++;
      pos += target.length();
    }

    return cnt;
  }
}
// for문으로 접근하려면 조건문을 최대한 잘 바꿔야함. 아니면 if eles 구문에서 break; 를 써서 무한루프를 빠져나가도록해야함.
// for (int pos = 0; (pos = src.indexOf(target, pos)) != -1; pos += target.length()) {
//     cnt++;
// }
// while 루프를 for 루프로 변경하려면 초기화, 조건식, 증감식을 for 루프의 괄호 안에 넣어주면 됩니다.
// return cnt;
// 반복하는 조건이 true false로 나뉠때는 while을 쓰도록 하자.
// while (true) {
//     pos = src.indexOf(target, pos);
//     if (pos != -1) {
//         cnt++;
//         pos = pos + target.length();
//     }else{
//         break;
//     } // 조건문이 true 이기 때문에 무한반복 break; 로 반복문을 빠져나가도록 설계.
// }
