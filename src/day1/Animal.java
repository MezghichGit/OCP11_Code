package day1;

public class Animal {
	
	String name;
	int age;
	static int nbr;
	
	public Animal() {
		
		System.out.println("Constructeur");
	}
	
	{
		System.out.println("Bloc d'initialisation d'instance");
	}
	
	static{
		System.out.println("Bloc d'initialisation de classe");
	}


}
