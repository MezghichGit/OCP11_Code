package day3.exo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exo1 {

	public static void main(String[] args) {
		
		Path path = Paths.get("/user/.././root","../kodicard.txt");
		Path relative = Paths.get("/lion");
		Path res = path.normalize().relativize(relative);
		
		System.out.println(res);

	}

}
