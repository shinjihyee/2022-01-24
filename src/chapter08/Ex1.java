package chapter08;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object1 obj1 = new Object1();
		
		obj1.printLines();
		
		System.out.println("1. �α���");
		System.out.println("2. ȸ������");
		System.out.println("3. ��������");
		System.out.println("4. ȸ��Ż��");

		
		obj1.printLines();
		
		obj1.add();
		
		// �ݺ��Ǽ� ���Ǵ� �ڵ�� ----- �������� �ִ� sysout 
		// �ݺ��Ǵ� �� �ݺ������� �ٲٶ�� �ߴµ� 
		// �̷� �ſ��� �ݺ������� �ٲٸ� �������� �������� 
		
		Object2 obj2 = new Object2();
		
		obj2.add();
		
		
	}

}
