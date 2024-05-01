package com.example.thread;

import java.util.ArrayList;

/**
 * chef1,chef2,chef3을 ArrayList에 추가하고 for~each루프를 사용하여
 * 각 쓰레드에 대해 join() 메서드를 호출하는 코드를 작성해보세요
 */

public class RestaurantArrayListMain {
    public static void main(String[] args) {
        //요리사들은 ArryList에 추가 합니다.
        ArrayList<Chef> chefs = new ArrayList<>();
        chefs.add(new Chef("요리사1", "스테이크"));

        //요리사들의 쓰레드를 시작합니다.
        for (Chef chef : chefs) {
            chef.start();
        }
        //각 요리사의 쓰레드가 종료될 때까지 기다립니다.
        for (Chef chef : chefs) {
            try {
                chef.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }
}
