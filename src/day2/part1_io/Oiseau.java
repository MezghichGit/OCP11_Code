package day2.part1_io;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Oiseau extends Animal{
	
	@Override
	public Oiseau info() throws FileNotFoundException
	{
		//super.info();
		System.out.println("Oiseau");
		return new Oiseau();
	}
}
