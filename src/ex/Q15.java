package ex;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단을 출력할 숫자를 입력하세요(2~9): ");
        int a = sc.nextInt();
        sc.close();

        for (i = 1; i <= 9; i++) {
            System.out.printf("%d ", a*i);
        }
    }
}
