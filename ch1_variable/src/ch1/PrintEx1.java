package ch1;

public class PrintEx1 {
    public static void main(String[] args) {
        //화면출력
        int var1 = 35, var2 = 25;
        boolean flag = true;
        System.out.println(var1 + ", " + var2 + ", " + flag); // 35, 25 ,true

        // printf 지시자  enter 개념이 안들어있음.
        // %d : 10진 정수 형태로 출력
        // %b : boolean 형태로 출력
        // %c : char 형태로 출력
        // %s : String(문자열) 형태로 출력
        // %f : 부동소수점(float, double) 형태로 출력
        // %숫자 : 총 자릿수 / @ 오른쪽 정렬 출력 / 0@ 없는 자리는 0으로 채워서
        System.out.printf("var1 = %5d, var2 = %05d, flag = %b\n", var1, var2, flag); // " " 안쪽이 sout구절 , 이후 대입할 변수

        float f1 = 3.141592f;
        double d1 = 31.41592d;
        // %.숫자 표시할 소수점 자릿수
        System.out.printf("f1 = %.5f\n", f1);
        System.out.printf("d1 = %5.3f\n", d1);
    }
    
}
