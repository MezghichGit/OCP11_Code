package day1.programmation_fonctionnelle;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LObjetOptional {

	public static Optional<Double> calculMoyenne(double... tab) {
	//public static double calculMoyenne(double... tab) {
		if(tab.length == 0)
			return Optional.empty();  // Optional vide
		else {
			  double res = 0.0;
		
				for (double v : tab) {
					res = res + v;
				}
				res = res / tab.length;

		return Optional.of(res);  // Optional contenant la moyenne
		}
	}

	public static void main(String[] args) {
		
		
		//Optional<Double> res1 =  calculMoyenne(10,16);
		/*if(res1.isPresent())
			System.out.println(res1.get());*/
		
		//res1.ifPresent(System.out::println);
		
		//System.out.println(calculMoyenne(10,16));
		//System.out.println(calculMoyenne());
		
		
		/*
		 * Stream<Integer> numbers = Stream.of(1,10,3,2,4,5);
		 * 
		 * long res = numbers.filter(x->x%2==0).peek(System.out::println).count();
		 * 
		 * System.out.println("res = "+res);
		 */

		// long nbr = numbers.count();
		// System.out.println(nbr);
		// numbers.forEach(System.out::println);
		Stream<Integer> numbers = Stream.of();
		//Stream<Integer> numbers = Stream.of(10,2,4);
		Comparator<Integer> comp = (v1,v2)->v1-v2;
		numbers.min(comp).ifPresent(System.out::println);
		
		Predicate pred;

	}

}
