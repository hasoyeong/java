package ex;

public class Q13 {
    public static void main(String[] args) {

        int[] A = { 20, 55, 67, 82, 45, 33, 90, 87, 100, 25 };
        int total = 0;

        for (int i=0; i<A.length; i++) {
            if ( A[i] > 50 )
                total += A[i];
        }
        System.out.println(total);

    }
}
