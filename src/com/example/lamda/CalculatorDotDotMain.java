package com.example.lamda;

/**
 * Calculator:divide 나눗셈 연산을 수행하는 메서드 입니다.
 * 메서드 참초(::)를 사용하여 이 메서드를 'Calculator' 인터페이스의 'div'메서드와 연결합니다.
 * CalculatorDotDotMain 클래스의 divide 메서드가 호출되어 나눗셈을 수행합니다.
 */
// 람다 표현식을 사용하여 Calculator 인터페이스 구현
    interface Calculator1 {
  //  double add(double a, double b);
    double div(double a, double b);
}
public class CalculatorDotDotMain {
    public static void main(String[] args) {
        //Calculator 인터페이스에 대한 메서드 참조를 정의 합니다.
        Calculator1 addition = Double::sum;
        Calculator1 division = CalculatorDotDotMain::divide;
        //연산 테스트합니다.
        double num1 = 10;
        double num2 = 5;

      //  System.out.println("덧셈 결과: "+ addition.add(num1, num2));
        System.out.println("나눗셈 결과: "+ division.div(num1, num2));


    }//main
    //나눗셈 메서드
    public static double divide(double x, double y){
        if(y == 0){
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }else {
            return x/y;
        }
    }
}
