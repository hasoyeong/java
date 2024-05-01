package com.example.lamda.book;

import java.util.function.BiFunction;

public class SampleBi {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> mc = (a, b) -> a + b;
        int result = mc.apply(10, 20); //내부적으로 두숫자를 더한 결과를 반환 합니다.
        System.out.println(result);
    }
}
