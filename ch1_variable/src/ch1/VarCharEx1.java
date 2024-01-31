package ch1;

public class VarCharEx1 {
    public static void main(String[] args) {
        // 2. 문자형 - char(2byte)
        // 문자를 표현할때 '' 사용
        // 문자(한 글자) - 문자열(한글자이상)
        // 문자는'' 사용, 문자열은 " " 사용
        char name = 'J';
        char var1 = '\u0041'; // 아스키코드의 65번에 해당하는 대문자 A
        char var2 = 44032;
        // 문자에는 코드값이 정의 되어 있음 = 유니코드, 아스키코드, UTF-8
        // A = 65, a = 97, 0 = 48 영어는 26
        // char name1 = "Ja"; 타입 미스매칭 
        // String name2 = "Ja"; // 문자열에서는 String "" 사용
        System.out.println("나의 이름은 " + name);
        
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        
    }
    
}
