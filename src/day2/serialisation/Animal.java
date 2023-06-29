package day2.serialisation;

import java.io.Serializable;

public class Animal implements Serializable{
	
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
	}

}
