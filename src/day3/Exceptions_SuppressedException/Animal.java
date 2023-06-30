package day3.Exceptions_SuppressedException;

public class Animal implements AutoCloseable{

	int id;
	public Animal(int id) {
		super();
		this.id = id;
	}
	public void doSomething()
	{
		System.out.println("playing");
	}
	@Override
	public void close() throws Exception {
		System.out.println("Destruction de Animal ID = "+this.id);
		throw new IllegalArgumentException("Problème dans Animal ID = "+this.id);
	}

}
