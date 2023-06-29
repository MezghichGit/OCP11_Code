package day2.part1_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("C:\\Users\\amine\\Desktop\\Formation_OCP\\contenu.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(file)))
		{
			System.out.println(br.readLine());
		}

	}

}
