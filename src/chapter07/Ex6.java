package chapter07;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object2 obj2 = new Object2();
		// ���⼭ ���α׷��� �����ϸ� �ش� é�Ϳ� �ִ� ������Ʈ�� ���� ���� �ƴ϶� ��ü é�� ������Ʈ�� �м��Ѵ�. 
		
		Object2 obj3 = new Object();
		
		obj2.num1 = 1; 
		obj3.num2 =2;
		
		
		System.out.println("obj2.num1 = " + obj2.num1);
		System.out.println("obj3.num1 = " + obj3.num2);
		
		
		Object2.num2 = 3; 
		System.out.println("Object2.num =" + Object2.num2);
		
		obj2.num2 = 4;
		obj3.num2 = 5;
		// Object2 ���� ������ Ÿ���̱⿡ RAM������ obj2�� ��ü�� ���� ��¡ �ϰ� Ŭ���� ������ ���� �ҽ��ڵ带 ���� �� ���� �� ������ �ϰ� Ŭ������ ������ �� ã�� Ŭ���� ������ ���� ������ �Ѵ�. 
		System.out.println(obj2.num2);
		System.out.println(obj3.num2);
	}

}
