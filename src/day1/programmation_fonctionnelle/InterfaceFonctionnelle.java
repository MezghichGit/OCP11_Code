package day1.programmation_fonctionnelle;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class InterfaceFonctionnelle {

	public static void main(String[] args) {
		/*
		Function<String,Integer> transform = (String ch)->ch.length();
		
		Stream<String> names = Stream.of("Mehdi","Amine","Jérome","William");
		names.map(transform).forEach(System.out::println);*/
		
		UnaryOperator<Integer> up = x -> (x+2);
		Supplier<Double> randoms = Math::random;
		
		//Stream<Integer> numbers = Stream.iterate(3, up);
		Stream<Double> numbers = Stream.generate(randoms);
		numbers.limit(10).forEach(System.out::println);
		

	}

}
