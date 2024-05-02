package ex;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        ArrayList<Integer> temp = new ArrayList<>();
        //홀수만 필터링하여 새로운 배열로 변환
        int[] result = Arrays.stream(numbers)
                .filter((num) -> num % 2 == 1)
                .map(num -> num * 2)
                .toArray();
        //출력
        System.out.println("홀수만 출력한 결과:" + Arrays.toString(result) );
    }//main
}
