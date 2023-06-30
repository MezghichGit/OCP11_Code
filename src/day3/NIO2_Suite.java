package day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class NIO2_Suite {

	public static void main(String[] args) {
		//Path path = Paths.get("C:\\Users\\amine\\Desktop\\Formation_OCP\\contenu.txt");
		/*
		try {
			System.out.println(Files.size(path));
			long t = Files.getLastModifiedTime(path).toMillis();
			//System.out.println(Files.getLastModifiedTime(path).toMillis());
			Date date=new Date(t);
			System.out.println(date);
			final List<String> lines = Files.readAllLines(path);
			for(String line: lines) {
				System.out.println(line);
				}
			} 
	
		catch (IOException e) {// Handle file I/O exception...
			
		}*/
		
		Path path = Paths.get(".");
		try {
			
			Files.walk(path).filter(p -> p.toString().endsWith(".java")).forEach(System.out::println);
		}
		catch (IOException e) {// Handle file I/O exception...
			
		} 


	}

}
