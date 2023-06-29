package day2.laClasseConsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LectureClavier {

	public static void main(String[] args) throws IOException {
		try(
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			String phrase = br.readLine();
			System.out.println("Vous avez taper : "+ phrase);
		}

	}

}
