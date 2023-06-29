package day1.programmation_fonctionnelle;

import java.util.ArrayList;
import java.util.List;

public class Bounds {

	public static void main(String[] args) {
		/*
		Animal a = new Animal();
		
		//Polymorphisme d'héritage
		Oiseau o = new Oiseau();
		o.x = 10;
		o.y = 20;
		Animal a1 = new Oiseau();
		a1.x = 3;
		
		
		a=o;  //Upcasting
		a = new Oiseau();
		o=(Oiseau)a;  //Downcasting + cast explicite + upCast*/
		
		
		List<Animal>la = new ArrayList<>();
		List<Oiseau>lo = new ArrayList<>();
		
		//la = lo;
		//lo = la;
		//1)Unbounded type
		/*List<?>l; // l peut pointer sur n'importe qu'elle type de List d'objet
		l = la;
		l = lo;*/
		
		//2)Upper Bounds
		
		//List<? extends B>l;
		//l = new ArrayList<B>();
		
		//3)Lower Bounds
		
		/*List<? super B>l;
		l = new ArrayList<A>();*/

	}

}
