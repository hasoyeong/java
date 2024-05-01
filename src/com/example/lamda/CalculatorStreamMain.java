package com.example.lamda;

import java.util.Arrays;

// Calculator2 인터페이스
@FunctionalInterface
interface Calculator3 {
    double sum(double... numbers);
}

// 람다 표현식을 사용하여 Calculator2 인터페이스 구현
public class CalculatorStreamMain {
    public static void main(String[] args) {
        // Calculator2 인터페이스에 대한 메서드 참조를 정의 합니다.
        Calculator3 addition = CalculatorVarMain::sum;

        // 연산을 테스트 합니다.
        double result = addition.sum(100,2,3,4,5);
        //결과값이 100을 초과하는 경우에만 100을 출력합니다.
        Arrays.stream(new double[]{result})
                .map(num -> Math.min(num, 100))
                .forEach(System.out::println);
        //스트림을 사용하여 sum()메서드 결과값이 100초과하는 경우만 100을 출력하도록 구현, 결과값을 스트림에 담고,
        //map()메서드를 사용하여 결과값이 100이 초과하는 경우 100으로 값을 대체하고, farEach()메서드를 사용하여 최종 결과를 출력
        //map(): 스트림내의 각 요소에 대해 특정 작업을 수행하는 함수를 적용하여 새로운 스트림을 생성하는 역할을 합니다.
        //그래서 map()이 스트림에 있는 각 요소를 확인하고, 그 값이 100을 초과하는 경우에는 100으로 값을 변경하는 작업을 수행.
        //예시에 114는 100을 초과하기 때문에 Math.min(114,100)이 됩니다. 이 100을 새로운 스트림에다가 저장되어 출력
        //Strem: 예시)우편물이 5통 있습니다. 5통의 우편물을 책상위에 쌓여진 채로 있는 것을'스트림'.
        //map()메서드는 책상위에 쌓인 우편물을 하나씩 꺼내서 특정한 작업을 수행하고, 그 결과를 다시 새로운 테이블에 쌓는 역할

    }//main
    //덧셈 메서드
    public static double sum(double... numbers) {
        double result = 0;
        for (double number : numbers) {
            result += number;
        }
        return result;
    }
}

