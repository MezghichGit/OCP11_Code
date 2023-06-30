package day3.synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {
	//private int sheepCount = 0;
	private AtomicInteger sheepCount = new  AtomicInteger(0);
	
	private void incrementAndReport() {
		//sheepCount = sheepCount + 1;
		//System.out.print(sheepCount + " ");
		System.out.print(sheepCount.incrementAndGet()+ " ");
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(3);
			SheepManager manager = new SheepManager();
			for (int i = 0; i < 10; i++)
				service.submit(() -> manager.incrementAndReport());
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}
