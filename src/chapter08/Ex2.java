package chapter08;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Object3 obj3 = new Object3(); 
		
		obj3.printLines1(); // �Ű������� ������ ���� �����ϸ� �ȵȴ�. ���� ���� �ִ� ���� ��� ��. 

		// �޼��带 ȣ���� �� �ִ� ���� ���ڶ�� �Ѵ�. 
		obj3.printLines2(3); // �޼���� ���� ������ ���� ���ݴ� �Ұ�ȣ () �ȿ� ���� �־ �޼���� ���� �����Ѵ�. 
		obj3.printLines2(-1);
		
		// printLinese3 �޼��带 ȣ���غ�����.
		
		obj3.printLines3(12.1);
		
		obj3.printLines4(1, 2);
	}

}
