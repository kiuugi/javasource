package ch1;

public class SpecialChar {
    public static void main(String[] args) {
        // 탭 == \t, 엔터 == \n
        // "" == " \" \" "
        // '' == " \' \' "
        System.out.println("성명    주소    전화번호");
        System.out.println("성명\t주소\t전화번호");
        System.out.println("\"Hello\"");
        System.out.println("'Hello'");
        System.out.println("재미있는\\자바"); //Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ ) \ 하나만 쓸 경우 나오는 에러
        System.out.println("\n");
        System.out.println("escape 문자");
        System.out.print("테스트");
        System.out.print("테스트");
        System.out.print("\n테스트");
        
        // 화면 출력
        // System.out.print(); == sout 구문이 옆으로 붙어서 나옴
        // System.out.println(); == 끝나고 enter를 침 -- 줄바꿈 == \n
        // System.out.printf(); == 
    }
    
}
