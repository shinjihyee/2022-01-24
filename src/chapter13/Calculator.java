package chapter13;

public class Calculator implements Calcullatorable {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2; 
	}

	@Override
	public int minus(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2; 
	}

	@Override
	public int multi(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public double div(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 /num2;
	}
	
}