package day1;

//import java.util.Arrays;
import static java.util.Arrays.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Application {

	public static void main(String[] args) {
		/*
		int tab[] = {10,2,4};
		List<Object> list = Arrays.asList(tab);
		System.out.println(list);
		list.add(12);*/  // impossible d'ajouter/supprimer une case impossible
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(14);
		Object[]tab = list.toArray();
		System.out.println(tab.length);
		System.out.println(tab[0]);
		/*
		Animal a = new Animal();
		Animal a2 = new Animal();*/
		/*
		sort(tab);
		for(int e : tab)
		{
			System.out.print(e+"\t");
		}*/
	}

}
