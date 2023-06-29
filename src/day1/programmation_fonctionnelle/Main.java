package day1.programmation_fonctionnelle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		/*
		Prediction<String> p1 = (String mot)->{return mot.contains("ocp");}; // expression verbose
		
		Prediction<String> p2 = word->word.contains("ocp");
		
		System.out.println(p1.test("formation ocp 11"));*/
		/*
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Olivier");
		names.add("Laurant");
		names.add("Fabien");
		names.add("Vincent");
		System.out.println(names);
		
		for(int i = 0; i<names.size(); i++)
		{
			if(names.get(i).contains("i"))
			{
				names.remove(i);
			}
		}*/
		
		/*
		for(String name : names) //Enhanced loop
		{
			if((name).contains("i"))
			{
				names.remove(name);
			}
		}*/
		//System.out.println(names);
		//Predicate<String> filter = nom -> nom.contains("i");
		//names.removeIf(filter);
		//System.out.println(names);
		/*
		Supplier<StringBuilder> fournisseurSB = ()->new StringBuilder("ocp");
		System.out.println(fournisseurSB.get());
		Supplier<String> fournisseurS = ()->"oca-ocp";
		System.out.println(fournisseurS.get());
		
		Supplier<List<String>> fournisseurList;*/
		/*
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Olivier");
		names.add("Laurant");
		names.add("Fabien");
		names.add("Vincent");
		Consumer<String> consummer = ch ->System.out.println(ch);
		names.forEach(consummer);*/
		
		//API Stream
		
		List<Employer> employes = new ArrayList<>();
		employes.add(new Employer("Alain",25));
		employes.add(new Employer("Patrick",24));
		employes.add(new Employer("Bruno",30));
		employes.add(new Employer("Jean Claude",32));
		Comparator<Employer>compAge = (e1,e2)->e1.age - e2.age;
		Comparator<Employer>compNom = (e1,e2)->e1.nom.compareTo(e2.nom);
		Stream<Employer> streamEmp = employes.stream();
		//streamEmp.filter(employer->employer.nom.length()>5).peek(emp->System.out.println(emp.nom)).sorted(compNom).forEach(emp->System.out.println(emp.toString()));
		
		streamEmp.filter(employer->employer.nom.length()>5).peek(emp->System.out.println(emp.nom)).sorted(compNom).
		forEach(System.out::println);
		

	}

}
