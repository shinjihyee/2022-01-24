package chapter05;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
				
		// 2022�� 8�� ��¥�� dayOfMonth ������ �����ϰ� �ش� ��¥�� ������ ����ϼ���
		// Ư¡ ã�� 
		// ������ Ư���� ã�� ���ؼ��� �������� 7���̴ϱ� 
		// 7�� ���� ���������� ã�ƺ��� Ư¡�� �� �� �ִ�
		// �� ) 8 % 7 , 1 % 7 , 15 % 7 ... �������� ��¥�� �� 7�� ����غ��� 1�̴� 
		// �������� �����غ���
		// 7�� ���� �������� 2�� ȭ���� 2�� 4 �� 5�� 6�� 7�� 0 �Ͽ���
		
			int week = 7;
			
			int dayOfMonth = 13;
			
			int dayOfweek = dayOfMonth % week; 
			
			System.out.println("2022�� 8�� " +  dayOfMonth + "����");
			
			if	 (dayOfweek == 0) System.out.println("�Ͽ���");
			else if (dayOfweek == 1) System.out.println("������");
			else if (dayOfweek == 2) System.out.println("ȭ����");
			else if (dayOfweek == 3) System.out.println("������");
			else if (dayOfweek == 4) System.out.println("�����");
			else if (dayOfweek == 5) System.out.println("�ݿ���");
			else if (dayOfweek == 6) System.out.println("�����");
	}

}
