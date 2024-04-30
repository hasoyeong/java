package com.example.modifier;

class Singleton {
    private static Singleton one;
    private Singleton(){
    }
    public static Singleton getInstance(){
        if(one == null){ // NULL은 one라는 참조변수에 값이 없다. =>없으면 new Simgleton을 한번생성해라
            one = new Singleton();
        }
        return one;
    }
}

public class SingletonMain {
    public static void main(String[] args) {
      //  Singleton singleton = new Singleton();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.println(s2 == s3);

    }
}
