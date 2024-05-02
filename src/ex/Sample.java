package ex;

class HeavyWork extends Thread {//
    String name;

    public HeavyWork(String name) {
        this.name = name;
    }

    public void run() {//
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
            System.out.println("done"+ this.name);
        }
    }

    public class Sample {
        public static void main(String[] args) {
            long start = System.currentTimeMillis();
            for (int i = 1; i < 5; i++) {
                HeavyWork w = new HeavyWork("w" + i);
                w.start();//
            }
            long end = System.currentTimeMillis();
            System.out.printf("elapsed time:%s ms\n", end - start);
        }
    }

