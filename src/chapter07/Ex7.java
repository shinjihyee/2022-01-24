package chapter07;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ڵ��� �ΰ��� ���� �� p1,p2.
		Phone p1 = new Phone();
		
		Phone p2 = new Phone();
		
 
		p1.price = 1200000;
		p1.displaySize = 6.5;
		p1.ram = 8;
		// .maker �ȿ� ������ ������ class ���� ������ static�� �տ� ���̸� 
		// �ϳ��� ���� �� �ϰ� ���ļ� Ŭ���� ��������� ����Ͽ� �� �� �ִ�. 
		
		Phone.maker = "�Ｚ";

		p2.price = 5621;
		p2.displaySize = 5.5;
		p2.ram = 5;
		
	}

}
