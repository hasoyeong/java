package com.example.thread;


public class SampleThread extends Thread{
    int seq;

    public SampleThread(int seq) {
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq + "tgread start.");
        try {
            Thread.sleep(1000);
        }catch (Exception e){
    }
        System.out.println(this.seq + "tgread end."); //스레드 종료
    }



    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new SampleThread(i);
            t.start();
        }
        System.out.println("main end"); //메인 메서드 종료
    }
}
