package ex;

public class Q11 {
    public static void main(String[] args) {
        String a = "a:b:c:d";
        String[] result = a.split(":");
        System.out.println(String.join("#",result));
    }
}
