package ch1;

// 자동 형(타입)변환
// 정수형 / 문자형 / 실수형 / 논리형
// 타입 변환이 가능함 : 작은 타입에서 => 큰 타입으로 (byte기준)
public class PromotionEx1 {
    public static void main(String[] args) {
        byte v1 = 10;
        int intValue = v1;
        System.out.println("intValue = " + intValue);

        short s1 = 15;
        intValue = s1;
        System.out.println("intValue = " + intValue);
        
        char ch1 = 'a';
        intValue = ch1;
        System.out.println("intValue = " + intValue); // intValue = 97 
        //int 보다 작은 byte를 쓰는 애들은 int로 변환가능

        // 동일한 4byte 지만 float타입이 int 보다 더 정밀한 수를 표현함.
        //int(4byte) => float(4byte)
        float floatValue = intValue;
        System.out.println("floatValue = " + floatValue);


        //8byte
        long longValue = intValue;
        System.out.println("longValue = " + longValue);

        double doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue); // int 가 double(실수)타입으로 변환되면서 소수점이 붙음

        //int + double
        intValue = 55;
        doubleValue = 98.25d;
        //int result = intValue + doubleValue; // 에러Type mismatch: cannot convert from double to int
        double result = intValue + doubleValue; 
        System.out.println("int + double = double 타입으로 변환됨");
        System.out.println(result);

        byte v2 = 15;
        // byte byteValur = v1 + v2; => 정수를 변수에 담는다면 int 사용
        int byteValue = v1 + v2; // 연산 시 타입변환이 일어남 : 작은타입 => 큰타입 // byte 사용했을때 에러 Type mismatch: cannot convert from int to byte
        System.out.println(byteValue);
    }
    
}
