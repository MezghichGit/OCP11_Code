package day1.programmation_fonctionnelle;

import java.util.function.Predicate;



public class UseGenerics {
	
	public  static <T> void display(T t) // méthode générique
	{
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		
		display("OCP");
		display(true);
		display(12.5);
		Container<String> cs;
		Container<Double> cd;
		//Predicate ex4 = String::isEmpty; 

	}

}
