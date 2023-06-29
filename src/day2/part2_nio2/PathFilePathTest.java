package day2.part2_nio2;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathFilePathTest {
	public static void printPathInformation(Path path) {
		System.out.println("Filename is: " + path.getFileName());
		System.out.println("Root is: " + path.getRoot());

		Path currentParent = path;

		while ((currentParent = currentParent.getParent()) != null) {
			System.out.println("Current parent is: " + currentParent);
		}
	}

	public static void main(String[] args) throws IOException {
		/*
		printPathInformation(Paths.get("/zoo/armadillo/shells.txt"));
		System.out.println();
		printPathInformation(Paths.get("armadillo/shells.txt"));*/
		/*
		Path path1 = Paths.get("C:\\birds\\egret.txt");
		System.out.println("Path1 is Absolute? "+path1.isAbsolute());
		System.out.println("Absolute Path1: "+path1.toAbsolutePath());
		Path path2 = Paths.get("birds/condor.txt");
		System.out.println("Path2 is Absolute? "+path2.isAbsolute());
		System.out.println("Absolute Path2 "+path2.toAbsolutePath()); */
		/*
		Path path = Paths.get("/mammal/carnivore/raccoon.image");
		System.out.println("Path is: "+path); 
		System.out.println("Subpath from 0 to 3 is: "+path.subpath(0,3));
		System.out.println("Subpath from 1 to 3 is: "+path.subpath(1,3));
		System.out.println("Subpath from 1 to 2 is: "+path.subpath(1,2)); 
		*/
		/*
		final Path path1 = Paths.get("/cats/../panther");
		final Path path2 = Paths.get("food");
		System.out.println(path1.resolve(path2));*/
		/*
		final Path path1 = Paths.get("/turkey/food");
		final Path path2 = Paths.get("/tiger/cage");
		System.out.println(path1.resolve(path2));*/
		/*
		Path path3 = Paths.get("E:\\data");
		Path path4 = Paths.get("E:\\user\\home");
		Path relativePath = path3.relativize(path4);
		System.out.println(relativePath);
		
		System.out.println(path3.resolve(relativePath));
		System.out.println(path3.resolve(relativePath).normalize());*/
		
		System.out.println(Paths.get(".").toRealPath()); 
		Path path4 = Paths.get("E:\\user\\home");
		path4.toRealPath();

	}
}
