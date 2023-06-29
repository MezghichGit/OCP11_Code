package day2.part1_io;

import java.io.IOException;

public class CheckedVSUnchecked {

	public static void info1() throws IOException
	{
		throw new IOException("Probleme");
	}
	
	public static void info2() throws RuntimeException
	{
		throw new IllegalArgumentException("Argument invalide");
	}
	
	public static void main(String[] args)  {
		//info2() {
		//	info1();
		
		System.out.println("Fin du programme...");
	}

}
