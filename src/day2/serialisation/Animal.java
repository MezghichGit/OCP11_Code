package day2.serialisation;

import java.io.Serializable;

public class Animal implements Serializable{
	/*
	private  static final long serialVersionUID = 1;
	private String name;
	private int age;
	private char type;
	public Animal(String name, int age, char type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getType() {
		return type;
	}*/
	
	//private  static final long serialVersionUID = 2;
	private transient String name;
	private transient int age;
	private static char type;
	
	public Animal() {
		
		this.name = "Unknown";
		this.age = 12;
		this.type = 'D';
	}
	
	
	public Animal(String name, int age, char type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getType() {
		return type;
	}


}
