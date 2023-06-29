package day1.programmation_fonctionnelle;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
        /*List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> fromList = list.stream();*/
        ///Stream<String> fromListParallel = list.parallelStream(); 
		//System.out.println(fromList.findAny().get());
		//Stream<String> fromListParallel = list.parallelStream(); 
		
		/*Stream<String> names = Stream.generate(()->"Hello OCP");
		//names.forEach(System.out::println);
		boolean res = names.allMatch(x->x.length()<20);
		System.out.println(res);*/
		
		//Stream<String> stream = Stream.of("w", "o", "l", "f");
		/*
		List<String> list =Arrays.asList("a","b","w", "o", "l", "f","k","l");
		
		//Stream<String> stream = Stream.of("w", "o", "l", "f");
		Stream<String> stream = list.parallelStream();
		String word = stream.reduce("", (s, c) -> s + c, (s, c) -> s + c);
		
		System.out.println(word); // wolf */
		/*
		Stream<String> stream = Stream.of("w", "l","o", "l", "f", "f");
		TreeSet<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set); */
		/*
		List<String> noms = Arrays.asList("amine","patrick","william","amine","ahmed","sami","patrick");
        List<String>res = noms.stream().filter(x->x.length()>5).distinct().collect(Collectors.toList());
        System.out.println(res);
        
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);*/
		IntStream intStream = IntStream.of(1, 2, 3);
		OptionalDouble avg = intStream.average();
		System.out.println(avg.getAsDouble());
        
        
	}

}
