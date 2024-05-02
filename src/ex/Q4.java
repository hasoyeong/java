package ex;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 0, -1, -3, 10, -100};
        int[] result = Arrays.stream(numbers)
                .filter((a)-> a>0)
                .filter((num)-> num>0)
                .toArray()
                ;
        System.out.println("음수만 필터랑한 결과: "+Arrays.toString(result));
    }
}
