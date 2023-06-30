package day3.lesCollections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		//Les collections
		/*
		Set<String> names = new TreeSet<>();
		//Set<String> names = new HashSet<>();
		names.add("amine");
		names.add("peter");
		names.add("sam");
		names.add("amine");
		
		System.out.println(names);*/
		/*
		Etudiant e1 = new Etudiant("ahmed",21);
		Etudiant e2 = new Etudiant("sam",20);
		
		Set<Etudiant> students= new TreeSet<>();
		students.add(e1);
		students.add(e2);
		System.out.println(students);*/
		
		//ArrayDeque<Integer> queue = new ArrayDeque<>();
		//1)FIFO
		/*
		queue.offer(14);
		queue.offer(10);
		queue.offer(20);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());*/
		//2)LIFO
		/*
		queue.push(14);
		queue.push(10);
		queue.push(20);
		System.out.println(queue.peek());
		System.out.println(queue.pop());
		System.out.println(queue.peek());
		System.out.println(queue.pop());
		System.out.println(queue.peek());*/
		
		
		//Exemple avec l'interface Map
		//Map<String, Integer> annuaire = new HashMap<>();
		/*
		Map<String, Integer> annuaire = new TreeMap<>();
		annuaire.put("amine", 20200300);
		annuaire.put("sam", 10400500);
		annuaire.put("peter", 30600700);
		
		System.out.println(annuaire);
		
		Set<String> keys = annuaire.keySet();
		System.out.println(keys);
		System.out.println("************");
		for(String key : keys)
		{
			System.out.println(annuaire.get(key));
		}
		annuaire.clear();
		System.out.println(annuaire);
		System.out.println(annuaire.isEmpty());*/
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(8);
		list.add(2);
		list.add(6);
		System.out.println(list);
		Collections.sort(list);  //[2, 6, 8, 12]
		//System.out.println(list);
		System.out.println(Collections.binarySearch(list,14)); //
		
		//int tab[] = {2, 6, 8, 12};
		int tab[] = {2, 1, 18, 12};
		System.out.println(Arrays.binarySearch(tab,12));
		
	}

}
