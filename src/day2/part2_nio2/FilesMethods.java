package day2.part2_nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesMethods {

	public static void main(String[] args) {
		/*System.out.println(Files.exists(Paths.get("/ostrich/feathers.png")));
		System.out.println(Files.exists(Paths.get("/ostrich")));*/
		/*
		try {
			//Files.createDirectory(Paths.get("C:\\Users\\amine\\Desktop\\Formation_OCP\\Boursorama\\Formation"));
			Files.createDirectories(Paths.get("C:\\Users\\amine\\Desktop\\Formation_OCP\\Boursorama\\Formation"));
		} catch (IOException e) {
			// Handle file I/O exception...
			System.out.println("Problème : "+e.getMessage());
			e.printStackTrace();
		}*/
		
		try {
		Files.copy(Paths.get("C:\\Users\\amine\\Desktop\\Formation_OCP\\contenu.txt"), 
				Paths.get("C:\\Users\\amine\\Desktop\\copy.txt"));
		/*Files.copy(Paths.get("/panda/bamboo.txt"),
				Paths.get("/panda-save/bamboo.txt"));*/
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
