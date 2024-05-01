package com.example.lamda;

// Calculator2 인터페이스
interface Calculator2 {
//    double sum(double... numbers);
    double div(double... numbers);
}
// 람다 표현식을 사용하여 Calculator2 인터페이스 구현
public class CalculatorVarMain {
    public static void main(String[] args) {
        // Calculator2 인터페이스에 대한 메서드 참조를 정의 합니다.
        Calculator2 addition = CalculatorVarMain::sum;
        Calculator2 division = CalculatorVarMain::div;

        // 연산을 테스트 합니다.
    //    System.out.println("덧셈결과: " + addition.sum(1, 2, 3, 4, 5));
            System.out.println("나눗셈결과: "+division.div(10,2,3));
    }//main

    //덧셈 메서드
    public static double sum(double... numbers) {
        double result = 0;
        for (double number : numbers) {
            result += number;
        }
        return result;
    }

    //나눗셈 메서드
    public static double div(double... numbers) {
        if (numbers.length < 2) {
            System.out.println("최소 2개의 숫자가 필요합니다.");
            return 0;
        }
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                System.out.println("0으로 나눌수 없습니다");
                result = 0;
            }
            result /=numbers[i];
        }
        return result;
    }
}

