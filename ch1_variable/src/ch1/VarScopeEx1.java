package ch1;

// 변수의 유효 범위
// local(지역) 변수 {} : {}블럭 안에서만 유효함 / 초기화를 하고 사용함
// 변수 선언 => 값을 할당(초기화)
public class VarScopeEx1 {
    public static void main(String[] args) {
        int v2 = 30;
        int v3; // 값을 안주고 변수 선언만 함
        //int v4; 
        {
            int v1 = 15;
            v3 = v1 + v2;
            System.out.println("v1 = " + v1);
            System.out.println("v2 = " + v2);
            System.out.println("v3 = " + v3);
        }
        //System.out.println("v1 = " + v1); // 에러 v1 cannot be resolved to a variable
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3); // v3가 속한 블럭이 main블럭이기 때문에 위쪽 블럭에서 지정한 값을 main블럭으로 가져옴
        //System.out.println("v4 = " + v4); // The local variable v4 may not have been initialized (로컬변수 v4가 초기화(값을 할당)되지 않았음)
    }

    void print(){
        //main 메소드 안에 선언된 변수를 사용할 수 있을까?
        //System.out.println(v2); v2 cannot be resolved to a variable 불가능
    }
    
}
