package day3.ThreadsUsingExecutorsService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		ExecutorService service = null;
		Runnable task1 = ()->{
			System.out.println(Thread.currentThread().getName());
			for(int i=0; i<10;i++)
			{
				System.out.println("i = "+i);
			}
		};
		
		Runnable task2 = ()->{
			System.out.println(Thread.currentThread().getName());
			for(int j=0; j<10;j++)
			{
				System.out.println("j = "+j);
			}
		};
		
		Runnable task3 = ()->{
			System.out.println(Thread.currentThread().getName());
			for(int k=0; k<10;k++)
			{
				System.out.println("k = "+k);
			}
		};
		
		
		
		try {
			//service = Executors.newSingleThreadExecutor();
			//service = Executors.newFixedThreadPool(2);
			service = Executors.newCachedThreadPool();
			service.execute(task1);
			service.execute(task2);
			service.execute(task3);
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
