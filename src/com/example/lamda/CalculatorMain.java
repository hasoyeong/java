package com.example.lamda;

//Calculator인터페이스
@FunctionalInterface
interface Calculator {
 //   double add(double a, double b);
//    double sub(double a, double b);
//    double mul(double a, double b);
    double div(double a, double b);
}
public class CalculatorMain {
    public static void main(String[] args) {
        //Calculator 인터페이스에 대한 람다 표현식을 정의합니다.
 //       Calculator addition = (a, b) -> a + b;
//        Calculator subtraction = (a, b) -> a - b;
 //       Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> {
            if (b == 0) {
                System.out.println("0으로 나눌 수 없습니다");
                return 0;
            } else {
                return a / b;
            }
        };
        // 사칙연산 테스트
            double n1 = 10;
            double n2 = 0;

 //      System.out.println("덧셈 결과: " + addition.add(n1, n2));
//        System.out.println("뺄셈 결과: " + subtraction.sub(n1, n2));
//        System.out.println("곱셈 결과: " + multiplication.mul(n1, n2));
        System.out.println("나눗셈 결과: " + division.div(n1, n2));
    }//main()
}
