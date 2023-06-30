package day3.Exceptions_SuppressedException;

public class Application {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int tab[] = { 10, 3, 14 };
		/*
		try {
			System.out.println(x / y);
			System.out.println(tab[3]);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Autre problème...");
		} finally {
			System.out.println("Fin du programme");
		}*/
		String ch = null;
		try {
			//System.out.println(x / y);
			//System.out.println(tab[3]);
			System.out.println(ch.length());
		} 
		
		catch (ArithmeticException  | ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}  
		
		catch (Exception e) {
			System.out.println("Autre problème...");
		} finally {
			System.out.println("Fin du programme");
		}

	}

}
