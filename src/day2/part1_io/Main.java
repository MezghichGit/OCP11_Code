package day2.part1_io;

import java.io.File;

public class Main {

	public static void main(String[] args) throws Exception {
		//System.out.println(System.getProperty("file.separator"));
		//System.out.println(java.io.File.separator); 
		
		//File file = new File("C:\\Users\\amine\\Desktop\\Formation_OCP\\Support_OCP11_Part1");
		//System.out.println(file.exists());
		try(MaRessource rs = new MaRessource())
		{
			rs.processing();
		}
		//il execute un bloc finally implicite contenant la méthode close
		
		System.out.println("Suite du programme...");

	}

}
