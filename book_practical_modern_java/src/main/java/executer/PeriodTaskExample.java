package executer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PeriodTaskExample {

    // 일정 시간 간격으로 스레드를 실행하는 예
    public static void main(String[] args) {

        // ScheduledExecutorService 객체 생성
        ScheduledExecutorService exeService = Executors.newScheduledThreadPool(2);

        // 2초 후에 실행, 종료 후 4초 대기 후 반복 실행
        exeService.scheduleWithFixedDelay(new MyTask("Delayed 1"), 2, 4, TimeUnit.SECONDS);

        // 2초 후에 실행, 4초 주기로 반복 실행
        exeService.scheduleAtFixedRate(new MyTask("Rate 1"), 2, 4, TimeUnit.SECONDS);

        // 2초 후에 실행, 4초 주기로 반복 실행
        exeService.scheduleAtFixedRate(new MyTask("Rate 2"), 2, 4, TimeUnit.SECONDS);
    }
}
