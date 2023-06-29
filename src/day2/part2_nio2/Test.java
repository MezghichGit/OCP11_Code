package day2.part2_nio2;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws URISyntaxException {
		/*
		 * Path path1 =
		 * Paths.get("C:\\Users\\amine\\Desktop\\Formation_OCP\\contenu.txt");
		 * System.out.println(path1.isAbsolute());
		 * 
		 * Path path2 =
		 * FileSystems.getDefault().getPath("c:","Users","amine","employees.txt");
		 * 
		 * FileSystem fileSystem = FileSystems.getFileSystem(new
		 * URI("http://www.selikoff.net")); Path path3 = fileSystem.getPath("duck.txt");
		 * 
		 * File file = new File("pandas/cuddly.png"); Path path = file.toPath();
		 * 
		 * Path path4 = Paths.get("cuddly.png"); File file2 = path4.toFile();
		 */
		Path path = Paths.get("C:\\Users\\amine\\Desktop\\Formation_OCP\\contenu.txt");
		System.out.println("The Path Name is: " + path.toString());
		System.out.println("The Path Name is: " + path);
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println(" Element " + i + " is: " + path.getName(i));
		}

	}

}
