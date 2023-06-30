package day3.les_Threads;

public class Main {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Begin");
		// new Thread(new Worker()).start();
		// new Thread(new Robot()).start();

		Runnable task1 = () -> {
			System.out.println(Thread.currentThread().getName());
			for (int i = 0; i < 5; i++) {
				System.out.println("Bonjour");
			}
		};
		
		new Thread(task1).start();
		
		
		Runnable task2 = () -> {
			System.out.println(Thread.currentThread().getName());
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello");
			}
		};
		new Thread(task2).start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hola");
		}
		
		new Job().start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hola");
		}
	}

}
