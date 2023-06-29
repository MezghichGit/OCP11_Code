package day1.programmation_fonctionnelle;

public class Employer {//implements Comparable<Employer>{
	
	String nom;
	int age;
	public Employer(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employer [nom=" + nom + ", age=" + age + "]";
	}
	/*
	@Override
	/*public int compareTo(Employer o) {
		// TODO Auto-generated method stub
		return this.nom.compareTo(o.nom);
	}*/
	/*
	public int compareTo(Employer o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}*/
	
	
	

}
