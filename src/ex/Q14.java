package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(); //Integer(정수)형식의 데이터를 저장하는 ArrayList를 생성하고, 이 리스트를 list라는 변수에 할당
        System.out.println("값을 입력하세요"); //사용자가 값(정수)을 입력
        Scanner sc = new Scanner(System.in);
        sc.close();
        int data=sc.nextInt();

        list.add(0);
        list.add(1);
        for(int i=2;i<data;i++) {
            list.add(list.get(i-2) + list.get(i-1));
        }
        System.out.println(list);
    }
}
