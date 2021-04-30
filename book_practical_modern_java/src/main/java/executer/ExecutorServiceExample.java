package executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {

    // ExecutorService 사용 예
    public static void main(String[] args) {
        // ExecutorService 객체를 생성한다.
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ExecutorService executorService = Executors.newCachedThreadPool();

        // Thread 를 생성하고 실행시킨다.
        executorService.execute(new MyTask("TODO 1"));
        executorService.execute(new MyTask("TODO 2"));
        executorService.execute(new MyTask("TODO 3"));

        // ExecutorService 를 종료 시킨다.
        executorService.shutdown();
    }
}

class MyTask implements Runnable {

    private final String id;

    public MyTask(String id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Task ID : " + id + ", running ... " + i);

            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
