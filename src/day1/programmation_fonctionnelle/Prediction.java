package day1.programmation_fonctionnelle;

@FunctionalInterface
public abstract interface Prediction<T> {
	 
	public abstract boolean test(T t);
	 
	 //version 8
	 public default void info1() {
		info3(); 
	 }
	 
	 public static void info2() {
		 info4();
	 }
	 
	 //version 9/11
	 
     private void info3() {
		 
	 }
     
     private static void info4() {
		 
	 }
}
