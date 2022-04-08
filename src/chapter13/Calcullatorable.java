package chapter13;

public interface Calcullatorable {
	
	public static final int value = 10; 
	
	
	// µ¡¼À
	public abstract int add (int num1, int num2) ;
	
	// »¬¼À
	public abstract int minus (int num1, int num2);
	// °ö¼À
	public abstract int multi (int num1, int num2);
	
	// ³ª´°¼À
	public abstract double div (int num1, int num2);
	
}
