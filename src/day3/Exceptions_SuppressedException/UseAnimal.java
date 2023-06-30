package day3.Exceptions_SuppressedException;

public class UseAnimal {

	public static void main(String[] args) throws Exception {
		try(Animal a1 = new Animal(1); Animal a2 = new Animal(2))
		{
			a1.doSomething();
			throw new IllegalArgumentException("Argument invalide");
		}//finally{a1.close();} implicite
		catch(IllegalArgumentException e)
		{
			System.out.println("Oups : "+e.getMessage());
			for(Throwable t : e.getSuppressed())
			{
				System.out.println(t.getMessage());
			}
		}
	}

}
