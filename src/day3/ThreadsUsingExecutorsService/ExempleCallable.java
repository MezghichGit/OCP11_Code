package day3.ThreadsUsingExecutorsService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExempleCallable {

	public static void main(String[] args) {
		
		Callable<Double> task = ()->Math.random();
		
		Runnable task2 = ()->System.out.println(Math.random());

		ExecutorService service = null;
		
		try {

			service = Executors.newCachedThreadPool();
			//Future<Double>res = service.submit(task);
			Future<?>res = service.submit(task2);
			System.out.println(res.get());
			System.out.println(res.isDone());
			System.out.println(res.isCancelled());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			if(service!=null)
				service.shutdown();
		}
	}

}
