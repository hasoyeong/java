package com.example.exception;

public class RuntimeExceptionMain {
    public static void main(String[] args) throws Exception {
        try {
            makeExceptions();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
     public static void makeExceptions() {
       //  makeException1(10);
       //  makeException2();
       //  makeException3();
      //   makeException4();
      //   makeException5();
      //   makeException6();
       //  makeException7();
         makeException8();
     }

    public static int makeException1(int input) {
        int div = input / 0;
        return div;
    }

    public static void makeException2() {
        String a = "a";
        System.out.println(a.charAt(1));
    }

    public static void makeException3() {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(a[5]);
    }

    public static void makeException4() {
        String nothing = null;
        System.out.println(nothing.split(""));
    }

    public static void makeException5() {
        String str = "abc";      //NumberFormatException
        int a = Integer.parseInt(str);
    }

    public static void makeException6() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            makeException6();    //RuntimeExceptionMain
        }
    }

    public static void makeException7() {
        Object[] objArr = new Object[2];
        objArr[0] = 0;
    }

    public static void makeException8() {
        Object[] objects = new Object[2];
        objects[0] = "abc";      //ClassCastException
        Integer i = (Integer) objects[0];
    }
}

