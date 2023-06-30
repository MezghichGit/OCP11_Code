package day3.lesCollections;

public class Etudiant implements Comparable<Etudiant >{
	
	String nom;
	int age;
	public Etudiant(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Etudiant o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}
}
