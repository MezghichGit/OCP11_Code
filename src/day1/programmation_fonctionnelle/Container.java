package day1.programmation_fonctionnelle;

public class Container <T>{
	
	T content;
	
	public void display(T t)
	{
		System.out.println(t);
	}
	
	public Container(T t)
	{
		this.content= t;
	}

}
