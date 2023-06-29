package day2.part1_io;

import java.io.IOException;

public class Animal {

	protected Animal info() throws IOException
	{
		System.out.println("Animal");
		return new Animal();
	}
}
