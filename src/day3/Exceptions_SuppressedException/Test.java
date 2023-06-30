package day3.Exceptions_SuppressedException;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		try {
		    System.out.println("Hello");
		    throw new IOException();
		}
		catch(IOException e) {}
		catch(Exception e) {}
		finally {}

	}

}
