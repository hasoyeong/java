package com.example.exception;

import java.util.Arrays;
import java.util.Comparator;

public class SampleRealStream {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2,3,1,1,2,2,4,8,0};
        int[] result = Arrays.stream(data)  // IntStream을 생성한다.
                .boxed()                    //IntStream을 Stream<Integer>로 변경한다.
                .filter((a)->a%2==0)        //짝수만 뽑아낸다.
                .distinct()                 // 중복을 제거한다. 같은 값은 무시된다
                //Comparator 인터페이스에 compare메서드는 두 개의 객체를 인자로 받아 비교하여
                //첫번째 객체가 작으면 음수, 같으면 0, 크면 양수 반환함.
                .sorted(Comparator.reverseOrder())  //역순으로 정렬한다.
                .mapToInt(Integer::intValue)//스트림의 요소를 정수값으로 변환하는 메서드
                .toArray()                  //int[] 배열로 반환한다.
                ;
        System.out.println(Arrays.toString(result));
    }
}
