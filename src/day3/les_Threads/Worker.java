package day3.les_Threads;

public class Worker implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i = 0; i<5; i++)
		{
			System.out.println("Bonjour");
		}
		
	}

}
