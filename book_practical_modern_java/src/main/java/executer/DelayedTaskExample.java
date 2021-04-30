package executer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DelayedTaskExample {

    // ScheduledExecutorService 사용 예
    public static void main(String[] args) {
        ScheduledExecutorService exeService = Executors.newSingleThreadScheduledExecutor();

        // 쓰레드 3개 등록과 실행
        exeService.schedule(() -> System.out.println("TODO 1"), 2, TimeUnit.SECONDS);
        exeService.schedule(() -> System.out.println("TODO 2"), 4, TimeUnit.SECONDS);
        exeService.schedule(() -> System.out.println("TODO 3"), 6, TimeUnit.SECONDS);
    }
}
