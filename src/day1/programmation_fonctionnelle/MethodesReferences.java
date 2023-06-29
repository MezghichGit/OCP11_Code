package day1.programmation_fonctionnelle;
import java.util.*;
import java.util.function.*;
public class MethodesReferences {

	public static void main(String[] args) {
		//3eme cas : Méthode de référence basée sur une méthode d'instance sur une instance qui sera connue à l'exécution
		/*
		Predicate<String> filter = ch ->ch.isEmpty();
		Predicate<String> filterv2 = String::isEmpty;
		System.out.println(filterv2.test("OCP"));
		*/
		
		//2eme cas : Méthode de référence basée méthode d'instance sur une instance prédefinie
		
		/*String formation = "Java OCP 11";
		
		Predicate<String> filter = ch ->formation.contains(ch);
		Predicate<String> filterv2 = formation::contains;
		
		System.out.println(filterv2.test("OCA"));*/
		// 1er cas : methode de classe
		/*
		Consumer<List<Integer>> consumer = (List<Integer> list)->Collections.sort(list);
		
		Consumer<List<Integer>> consumerv2 = Collections::sort; //méthode de référence basée sur la méthode static
		
		List<Integer>moy = new ArrayList<>();
		moy.add(10);
		moy.add(8);
		moy.add(14);
		moy.add(12);
		consumerv2.accept(moy);
		
		System.out.println(moy);*/

	}

}
