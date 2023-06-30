package day3.les_ThreadsUsingSchedule;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		ScheduledExecutorService service = null;
		
		service = Executors.newSingleThreadScheduledExecutor();
		
		Runnable task1 = ()->System.out.println(LocalDateTime.now());
		//service.scheduleAtFixedRate(task1, 0, 3, TimeUnit.SECONDS);
		
		service.scheduleWithFixedDelay(task1, 0, 3, TimeUnit.SECONDS);
	}

}
