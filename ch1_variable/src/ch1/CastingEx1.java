package ch1;

// 강제 형변환 : casting
// 큰 타입 => 작은 타입
// 강제 형변환을 쓸 경우 값의 손실이 일어날 수 있다
public class CastingEx1 {
    public static void main(String[] args) {
        int intValue = 129;
        byte byteValue = (byte) intValue; // 강제로 바꾸려는 타입을 ()안에 씀
        System.out.println("byteValue = " + byteValue); // -127 , 강제 형변환을 쓸 경우 값의 손실이 일어날 수 있다

        intValue = 44032;
        char charValue = (char) intValue;
        System.out.println("charValue = " + charValue); // 큰 타입에서 작은 타입으로 바꿀 경우 작은 타입에서도 충분히 담을 수 있는 크기라면 손실없이 변환

        double doubleValue = 3.1415d;
        intValue = (int) doubleValue;
        System.out.println("intValue = " + intValue);

        int num1 = 123456780, num2 = 123456780;
        // 자동형변환
        float num3 = num1;
        double num4 = num2;
        System.out.println("num3 = " + num3 + ", num4 = " + num4);

        num2 = (int)num3;
        num1 = (int)num4;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        
        int result = num1 - num2;
        System.out.println("result = " + result);

    }
    
}
