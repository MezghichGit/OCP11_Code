package day2.part1_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CopyTextFileSample {
	
	public static List<String> readFile(File source) throws FileNotFoundException, IOException
	{
		List<String> data = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(source)))
		{
			String mot;
			while((mot = br.readLine())!=null)
			{
				data.add(mot);
			}
		}
		
		return data;
	}
	
	public static void writeFile(List<String> data, File destination) throws IOException
	{
		try(BufferedWriter br = new BufferedWriter(new FileWriter(destination)))
		{
			for(String phrase: data)
			{
				br.write(phrase);
				br.newLine();
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File source = new File("C:\\Users\\amine\\Desktop\\Formation_OCP\\contenu.txt");
		File destination = new File("C:\\Users\\amine\\Desktop\\Formation_OCP\\contenu2Copy.txt");
		
		List<String> data = readFile(source);
		for(String string:data)
		{
			System.out.println(string);
		}
		//System.out.println(data);
		writeFile(data, destination);

	}

}
